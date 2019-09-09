package com.picc.hz2zj4wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    @RequestMapping("/index13")
    public String index(){
        System.out.println("我来了!!!!!!!!!");
        return "index";
    }
}
