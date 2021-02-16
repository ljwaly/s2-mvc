package com.ljw.spring.mvc.s2.mvc;

import com.ljw.spring.mvc.s2.mvc.scanner.MvcContainerScanner;
import com.ljw.spring.mvc.s2.mvc.scanner.SpringBeanContainerScanner;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * 自定义的mvc启动扫描注册类
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // 获取需要扫描springbean（非Controller）的扫描类
        return new Class[]{ SpringBeanContainerScanner.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // 获取需要扫描Controller的扫描类
        return new Class[]{ MvcContainerScanner.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/" };
    }


    @Override
    protected Filter[] getServletFilters() {
        Filter[] servletFilters = super.getServletFilters();

        // TODO: 可以自定义一些filter，servletFilters

        return servletFilters;
    }
}
