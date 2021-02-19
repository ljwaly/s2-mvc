package com.ljw.spring.mvc.s2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class MyTestController {

    @RequestMapping("/test")
    @ResponseBody
    public Map getTest(){
        System.out.println("==========MyTestController.getTest" );

        Map map = new HashMap();
        map.put("code", 200);
        map.put("result", "test");
        return map;
    }

    @RequestMapping("/ok")
    public String getOk(){
        System.out.println("==========MyTestController.getOK" );

        return "ok";
    }
}
