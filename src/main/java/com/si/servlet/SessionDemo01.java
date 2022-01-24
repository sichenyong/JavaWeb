package com.si.servlet;

import com.si.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //得到Session
        HttpSession session = req.getSession();
        //给Session传东西
        session.setAttribute("name",new Person("司称勇",21));

        //获取session的id
        String id = session.getId();

        //判断session是否是新创建的
        boolean aNew = session.isNew();
        if (aNew) {
            resp.getWriter().write("session创建成功, id:" + id);
        } else {
            resp.getWriter().write("session 已存在！id:" + id);
        }

        //Session在创建的时候都做了什么
        //Cookie cookie = new Cookie("JSESSIONID", session.getId());
        //resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
