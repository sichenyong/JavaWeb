package com.si.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //如何让浏览器5秒自动刷新一次
        resp.setHeader("refresh","3");

        //在内存中创建一个图片
        BufferedImage image = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D graphics = (Graphics2D)image.getGraphics(); //一支画笔
        //设置图片的背景颜色
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,80,20);
        //给图片写数据
        graphics.setColor(Color.BLUE);
        graphics.setFont(new Font(null, Font.BOLD,20));
        graphics.drawString(makeRandomArray(),0,20);
        //告诉浏览器这个请求用图片的方式打开
        resp.setContentType("image/png");

        //网站存在缓存，不让浏览器缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");

        //把图片写给浏览器
        boolean is_ok = ImageIO.write(image,"jpg" ,resp.getOutputStream());

    }

    //生成随机数
    private String makeRandomArray() {
        Random random = new Random();
        String array = String.valueOf(random.nextInt(9999999));
        StringBuffer sb = new StringBuffer();

        //若长度不够7 填充0
        for (int i = 0; i < 7-array.length(); i++) {
            sb.append("0");
        }
        array = sb.toString() + array;
        return array;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
