package com.ljw.spring.mvc.s2.mvc.scanner;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


// 在MVC中，这个只扫描有@Controller注解的类
@ComponentScan(
        value = "com.ljw.spring.mvc.s2",
        includeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
        },
        useDefaultFilters = false
    )
public class MvcContainerScanner {
}
