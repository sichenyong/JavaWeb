package com.si.servlet;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取下载文件的路径
        String realPath = this.getServletContext().getRealPath("/WEB-INF/classes/images/1.png");
        System.out.println("文件的真实路径：" + realPath);
        //2. 下载的文件名
        String FileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        System.out.println(FileName);

        //3. 设置想办法让浏览器能够支持(Content-Disposition)下载我们需要的东西 中文文件名 用URLEncoder.encode解决
        resp.setHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode(FileName,"UTF-8"));
        //4. 获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //5. 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        //6. 获取outputstream对象
        ServletOutputStream out = resp.getOutputStream();
        //7. 将Fileoutputstream写入缓冲区
        while ((len=in.read(buffer)) > 0) {
            out.write(buffer,0,len);
        }
        //8. 使用outputstream将缓冲区的数据输出到客户端


        in.close();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
