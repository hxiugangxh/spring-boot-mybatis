package com.hxg.springbootmybatis.dao;

import com.hxg.springbootmybatis.bean.People;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MyBatisXMLDao {

    public List<People> list();

}
