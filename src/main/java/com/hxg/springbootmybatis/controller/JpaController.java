package com.hxg.springbootmybatis.controller;

import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.bean.Student;
import com.hxg.springbootmybatis.dao.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private PeopleRepository peopleRepository;

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

