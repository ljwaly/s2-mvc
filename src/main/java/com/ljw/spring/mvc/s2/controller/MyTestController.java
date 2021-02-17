package com.ljw.spring.mvc.s2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyTestController {

    @RequestMapping("/getTest")
    public @ResponseBody String getTest(){
        System.out.println("test = getTest" );
        return "ok";
    }
}
