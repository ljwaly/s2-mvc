package com.ljw.spring.mvc.s2.controller;

import com.ljw.spring.mvc.s2.vo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Map getTest(@RequestBody User user){
        System.out.println("==========MyTestController.getTest" );

        Map map = new HashMap();
        map.put("code", 200);
        map.put("result", "test");
        map.put("user", user);

        return map;
    }

    /**
     * 这里使用了其他映射
     * @return
     */
    @RequestMapping("/ok")
    public String getOk(){
        System.out.println("==========MyTestController.getOK" );

        return "ok";
    }
}
