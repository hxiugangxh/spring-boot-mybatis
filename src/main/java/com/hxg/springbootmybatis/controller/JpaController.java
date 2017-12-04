package com.hxg.springbootmybatis.controller;

import com.hxg.springbootmybatis.bean.FastJsonBean;
import com.hxg.springbootmybatis.bean.Student;
import com.hxg.springbootmybatis.dao.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private PeopleRepository peopleRepository;

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

        return fastJsonBean;
    }

    @GetMapping("/list")
    public List<Student> list() {

        return peopleRepository.findAll();
    }

    @GetMapping("/save")
    public Student save(Student student) {

        System.out.println(student);

        return peopleRepository.save(student);
    }

}

