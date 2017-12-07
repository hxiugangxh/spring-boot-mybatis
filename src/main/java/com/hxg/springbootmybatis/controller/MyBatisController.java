package com.hxg.springbootmybatis.controller;

import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.service.MyBatisService;
import jdk.nashorn.api.scripting.ScriptUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MyBatisController {

    @Autowired
    private MyBatisService myBatisService;

    @GetMapping("/list")
    public List<People> list() {

        System.out.println("list");

        List<People> list = myBatisService.list();

        return list;
    }

    @GetMapping("/save")
    public People save(People people) {

        int rs = myBatisService.save(people);

        System.out.println("rs = " + rs);

        return people;
    }

    @GetMapping("/selectByPage")
    public List<People> selectByPage(Integer pn, Integer pageSize) {

        return myBatisService.selectByPage(pn, pageSize);
    }
    
    @GetMapping("/mySelect")
    public List<People> mySelect(String name) {

        System.out.println("name = " + name);

        return myBatisService.mySelect(name);
    }

    /**
     * # 与 $符号的区别
     */
    @GetMapping("/mySelect2")
    public List<People> mySelect2(String name) {

        System.out.println("name = " + name);

        return myBatisService.mySelect2(name);
    }

    @GetMapping("/listWithUpdateTime")
    public List<People> listWithUpdateTime() {

        return myBatisService.listWithUpdateTime();
    }

    @GetMapping("/listProvider")
    public List<People> listProvider(People people) {

        return myBatisService.listProvider(people);
    }

    @GetMapping("/listProvider2")
    public List<People> listProvider2(People people) {

        return myBatisService.listProvider2(people);
    }
}
