package com.hxg.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/test")
    public String test(Map<String, Object> map) {

        map.put("name", "张三");
        map.put("age", "");

        return "test";
    }

}
