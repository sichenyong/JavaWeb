package com.si.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    //初始化 web服务器启动 过滤器就启动了CharacterEncodingFilter初始化！
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化！");
    }

    /*
        1.过滤中的所有代码，在过滤特定请求的时候都会执行
        2.必须要让过滤器继续通行 filterChain.doFilter(servletRequest,servletResponse)
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        System.out.println("CharacterEncodingFilter执行前....");

        filterChain.doFilter(servletRequest,servletResponse); //让我们的请求继续走，如果不写，程序到此被拦截停止

        System.out.println("CharacterEncodingFilter执行后....");
    }

    //销毁 服务器关闭的时候会销毁 CharacterEncodingFilter销毁！
    @Override
    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁！");
    }
}
