package com.hxg.springbootmybatis.service;

import com.hxg.springbootmybatis.bean.People;

import java.util.List;

public interface TestService {
    List<People> list();

    int save(People people);

    List<People> selectByPage(Integer pn, Integer pageSize);
}
