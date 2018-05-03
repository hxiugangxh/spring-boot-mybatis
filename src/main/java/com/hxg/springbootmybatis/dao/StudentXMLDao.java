package com.hxg.springbootmybatis.dao;

import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.controller.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface StudentXMLDao {

    List<Student> listStudent();

    List<Map<String, Object>> listMap();

}
