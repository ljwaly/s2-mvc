package com.ljw.spring.mvc.s2.controller.beanname;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/beanname/ok")
public class BeanNameController extends AbstractController {//BeanNameUrlHandlerMapping


    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("==========BeanNameController.handleRequestInternal");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ok");
        return mv;
    }
}
