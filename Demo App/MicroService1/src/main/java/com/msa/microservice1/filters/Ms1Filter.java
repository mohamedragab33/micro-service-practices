package com.msa.microservice1.filters;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Ms1Filter implements Filter {

Logger log= LoggerFactory.getLogger(Ms1Filter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        log.info("Logging Request  {} : {}", request.getMethod(), request.getRequestURI());

        filterChain.doFilter(request, response);

        log.info("Logging Response :{} , {}", response.getContentType() , response.toString());
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
