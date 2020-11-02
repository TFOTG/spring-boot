package com.example.pengwang.controller;

import com.example.pengwang.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author peng.wang
 * @Description TODO
 * @createTime 2019/10/30
 */
@Controller
public class RestController {


    @Autowired
    DemoService demoService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello,Spring boot!";
    }

    /**
     * 参数demo
     * @param name
     * @return
     */
    @RequestMapping("/world")
    @ResponseBody
    public String word(@RequestParam String name) {

        int a=demoService.getCount();


        return "word--spring boot:" + name+a;
    }
}
