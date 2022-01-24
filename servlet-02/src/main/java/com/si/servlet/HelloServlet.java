package com.si.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //this.getInitParameter() 获取初始化参数
        //this.getServletConfig() 获取servlet配置
        //this.getServletContext() 获取servlet上下文

        ServletContext servletContext = this.getServletContext();
        String username = "司称勇"; //数据
        servletContext.setAttribute("username",username); //将一个数据保存在了ServletContext中，名为username,值为username

        System.out.println("hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
