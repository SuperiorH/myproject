package com.example.myproject.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String name = filterConfig.getInitParameter("name");
        System.out.println("name的值为"+name);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行方法前...");
        chain.doFilter(request, response);
        System.out.println("执行方法后...");
    }

    @Override
    public void destroy() {

    }

}
