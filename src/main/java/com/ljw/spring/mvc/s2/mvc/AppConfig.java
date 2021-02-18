package com.ljw.spring.mvc.s2.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * 装配一些jsp的映射controller
 *
 * 这里装配之后，会影响普通的@Controller映射，
 * 不共存
 *
 * 如果这里要启用，放开@Configuration注解，生成bean
 *
 * 注解@EnableWebMvc，用来替换xml配置的注解加载
 * 这里是把需要的HandlerMapping加载进来
 * 包含xml，jsp等一些
 * 
 * 注解@EnableWebMvc加载
 * RequestMappingHandlerMapping
 * HandleResolver
 * HandleAdapter
 * ViewResolver
 *
 */
//@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.enableContentNegotiation(new MappingJackson2JsonView());
        registry.jsp("/jsp/",".jsp");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/view/ok").setViewName("ok");
        registry.addViewController("/view/index").setViewName("index");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 装配拦截器-5
         *
         * 调用钩子方法。
         * 最终调用到自定义的实现了WebMvcConfigurer的类，调用对应实现的钩子方法的实现方法
         */
    }
}
