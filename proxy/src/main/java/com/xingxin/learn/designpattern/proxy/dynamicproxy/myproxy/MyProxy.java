package com.xingxin.learn.designpattern.proxy.dynamicproxy.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 自定义Proxy
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/5 下午10:25
 */
public class MyProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader classLoader, Class<?>[] interfaces, MyInvocationHandler h) {
        try {
            //1、动态生成源代码.java 文件
            String src = generateSrc(interfaces);
            //2、Java 文件输出磁盘
            String filePath = MyProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
            //3、把生成的.java 文件编译成.class 文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manage.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
            task.call();
            manage.close();
            //4、编译生成的.class 文件加载到 JVM 中来
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            f.delete();
            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.xingxin.learn.designpattern.proxy.dynamicproxy.myproxy;" + ln);
        //sb.append("import com.xingxin.learn.designpattern.proxy.dynamicproxy.myproxy.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("MyInvocationHandler h;" + ln);
        sb.append("public $Proxy0(MyInvocationHandler h) { " + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append(
                    "Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});"
                            + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }
        sb.append("}" + ln);
        return sb.toString();
    }

}
