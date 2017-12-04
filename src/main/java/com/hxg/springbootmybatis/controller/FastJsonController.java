package com.hxg.springbootmybatis.controller;

import com.hxg.springbootmybatis.bean.FastJsonBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FastJsonController {

    @GetMapping(value = "/test")
    public String test() {

        String str = "张三";

        return str;
    }

    @GetMapping(value = "/fastJson")
    public FastJsonBean fastJson() {

        FastJsonBean fastJsonBean = new FastJsonBean();
        fastJsonBean.setName("张三");
        fastJsonBean.setDate(new Date());
        fastJsonBean.setAge(99);

        return fastJsonBean;
    }
}
