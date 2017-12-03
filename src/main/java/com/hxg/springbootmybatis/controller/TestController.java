package com.hxg.springbootmybatis.controller;

import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/list")
    public List<People> list() {

        System.out.println("list");

        List<People> list = testService.list();

        return list;
    }

    @GetMapping("/save")
    public People save(People people) {

        int rs = testService.save(people);

        System.out.println("rs = " + rs);

        return people;
    }


    @GetMapping("/selectByPage")
    public List<People> selectByPage(Integer pn, Integer pageSize) {

        return testService.selectByPage(pn, pageSize);
    }

}
