package com.hxg.springbootmybatis.dao;

import com.hxg.springbootmybatis.bean.MyStudent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface StudentXMLDao {

    List<MyStudent> listStudent();

    List<Map<String, Object>> listMap();

}
