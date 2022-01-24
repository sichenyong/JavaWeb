package com.si.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //后台接受中文乱码问题
        req.setCharacterEncoding("UTF-8");
        //前台中文乱码
        resp.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");


        System.out.println("username:" + username + "\t password:" + password + "\nhobbies:" + Arrays.toString(hobbies));
        //重定向
        //resp.sendRedirect("/r2/success.jsp");

        //请求转发的时候 这里的/代表当前web应用，所以不用加/r2
        req.getRequestDispatcher("/success.jsp").forward(req,resp);
    }
}
