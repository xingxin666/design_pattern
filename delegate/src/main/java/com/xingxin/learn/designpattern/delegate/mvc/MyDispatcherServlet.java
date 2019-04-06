package com.xingxin.learn.designpattern.delegate.mvc;

import com.xingxin.learn.designpattern.delegate.mvc.controller.HomeController;
import com.xingxin.learn.designpattern.delegate.mvc.controller.SystemController;
import com.xingxin.learn.designpattern.delegate.mvc.controller.UserController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义DispatcherServlet
 *
 * @author xing_xin
 * @version V1.0
 * @date 2019/4/6 下午3:03
 */
public class MyDispatcherServlet extends HttpServlet {
    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> systemControllerClass = SystemController.class;
            handlerMapping.add(new Handler().setController(systemControllerClass.newInstance())
                    .setMethod(systemControllerClass.getMethod("login")).setUrl("/login"));
            Class<?> userControllerClass = UserController.class;
            handlerMapping.add(new Handler().setController(userControllerClass.newInstance())
                    .setMethod(userControllerClass.getMethod("getUserNameById", String.class))
                    .setUrl("/getUserNameById"));
            handlerMapping.add(new Handler().setController(userControllerClass.newInstance())
                    .setMethod(userControllerClass.getMethod("getUsers")).setUrl("/getUsers"));
            Class<?> homeControllerClass = HomeController.class;
            handlerMapping.add(new Handler().setController(homeControllerClass.newInstance())
                    .setMethod(homeControllerClass.getMethod("index")).setUrl("/"));
        } catch (Exception e) {

        }
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) {

        //1、获取用户请求的url
        //   如果按照J2EE的标准、每个url对对应一个Serlvet，url由浏览器输入
        String uri = request.getRequestURI();

        //2、Servlet拿到url以后，要做权衡（要做判断，要做选择）
        //   根据用户请求的URL，去找到这个url对应的某一个java类的方法

        //3、通过拿到的URL去handlerMapping（我们把它认为是策略常量）
        Handler handle = null;
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUrl())) {
                handle = h;
                break;
            }
        }

        //4、将具体的任务分发给Method（通过反射去调用其对应的方法）
        Object object = "404 not found";
        try {
            //object = handle.getMethod().invoke(handle.getController(), request.getParameter("id"));
            object = handle.getMethod().invoke(handle.getController(), null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //5、获取到Method执行的结果，通过Response返回出去
        try {
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(object.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            doDispatch(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class Handler {

        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }

/*    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        String id = req.getParameter("id");
        Object obj = null;
        if (uri.equals("/login")) {
            obj = new SystemController().login();
        } else if (uri.equals("/getUsers")) {
            obj = new UserController().getUsers();
        } else if (uri.equals("/getUserNameById")) {
            obj = new UserController().getUserNameById(id);
        } else {
            obj = "404 not found";
        }
        try {
            resp.setHeader("Content-type", "text/html;charset=UTF-8");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write(obj.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
