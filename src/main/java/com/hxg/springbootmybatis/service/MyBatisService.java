package com.hxg.springbootmybatis.service;

import com.hxg.springbootmybatis.bean.People;

import java.util.List;

public interface MyBatisService {
    List<People> list();

    int save(People people);

    List<People> selectByPage(Integer pn, Integer pageSize);

    List<People> mySelect(String name);

    List<People> mySelect2(String name);
}
