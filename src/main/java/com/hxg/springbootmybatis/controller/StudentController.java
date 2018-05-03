package com.hxg.springbootmybatis.controller;

import com.hxg.springbootmybatis.bean.MyStudent;
import com.hxg.springbootmybatis.dao.StudentXMLDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentXMLDao studentXMLDao;

    @GetMapping("/listMap")
    public List<Map<String, Object>> listMap() {

        System.out.println("测试");

        return studentXMLDao.listMap();
    }

    @GetMapping("/listStudent")
    public List<MyStudent> listStudent() {

        System.out.println("测试");

        return studentXMLDao.listStudent();
    }

}

