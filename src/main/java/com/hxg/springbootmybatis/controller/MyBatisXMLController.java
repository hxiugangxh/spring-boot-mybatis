package com.hxg.springbootmybatis.controller;

import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.service.MyBatisService;
import com.hxg.springbootmybatis.service.MyBatisXMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatisXML")
public class MyBatisXMLController {

    @Autowired
    private MyBatisXMLService myBatisXMLService;

    @GetMapping("/list")
    public List<People> list() {

        System.out.println("list");

        List<People> list = myBatisXMLService.list();

        return list;
    }
}
