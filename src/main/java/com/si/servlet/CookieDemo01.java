package com.si.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * 保存用户上一次访问的时间
 */
public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器告诉你，你来的时间，你把这个时间封装成一个信件，下次你带来，我就知道你来了

        //解决中文乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();

        //cookie, 服务器从客户端获取 request
        //返回数组，说明Cookie可能存在多个
        Cookie[] cookies = req.getCookies();
        //判断Cookie是否存在
        if (cookies != null) {
            //如果存在
            out.print("您上次的访问时间是：");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //获取cookie的名字
                String name = cookie.getName();
                if ("lastLoginTime".equals(name)) {
                    Date date = new Date(Long.parseLong(cookie.getValue()));
                    out.print(date.toLocaleString());
                }
            }
        } else {
            out.print("这是您第一次访问!");
        }
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis() + "");

        //cookie有效期为 一天
        cookie.setMaxAge(24*60*60);

        //服务器给客户端一个cookie
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
