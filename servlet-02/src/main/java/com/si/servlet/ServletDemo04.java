package com.si.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo04 extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //this.getInitParameter() 获取初始化参数
        //this.getServletConfig() 获取servlet配置
        //this.getServletContext() 获取servlet上下文

        System.out.println("进入了servletDemo04");
        ServletContext servletContext = this.getServletContext();
        /* 分开写
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/gp"); //转发的请求路径
        requestDispatcher.forward(req,resp); //调用forward实现请求转发
        */
        servletContext.getRequestDispatcher("/gp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
