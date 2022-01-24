package com.si.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServletDemo05 extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //this.getInitParameter() 获取初始化参数
        //this.getServletConfig() 获取servlet配置
        //this.getServletContext() 获取servlet上下文

        ServletContext servletContext = this.getServletContext();
        InputStream resourceAsStream = servletContext.getResourceAsStream("/WEB-INF/classes/db.properties");//读取资源
        Properties properties = new Properties();
        properties.load(resourceAsStream); //加载资源内容

        System.out.println("账户" + properties.get("username") + "密码" + properties.get("password"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
