package com.example.demo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author JIAOJIAO
 * 通过过滤器注册配置类使用过滤器
 */
@Configuration
public class WebConfiguration {
    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        //新建过滤器注册类
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 添加我们写好的过滤器
        registration.setFilter(new MyFilter());
        // 设置过滤器的URL模式
        registration.addUrlPatterns("/*");

        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        //过滤顺序，从小到大
        registration.setOrder(1);
        return registration;
    }

    public class MyFilter implements Filter {
        @Override
        public void destroy() {
            // TODO Auto-generated method stub
        }

        @Override
        public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
                throws IOException, ServletException {
            // TODO Auto-generated method stub
            HttpServletRequest request = (HttpServletRequest) srequest;
            System.out.println("this is MyFilter,url :"+request.getRequestURI());
            //将请求转发给过滤器链下一个filter,如果没有filter那就是你请求的资源
            filterChain.doFilter(srequest, sresponse);
        }

        @Override
        public void init(FilterConfig arg0) throws ServletException {
            // TODO Auto-generated method stub
        }
    }

}
