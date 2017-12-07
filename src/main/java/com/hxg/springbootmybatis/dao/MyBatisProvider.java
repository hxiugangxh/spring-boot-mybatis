package com.hxg.springbootmybatis.dao;

import com.hxg.springbootmybatis.bean.People;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class MyBatisProvider {

    public String listProvider(People people) {

        String querySQL = "select * from people where id = " + people.getId();

        return querySQL;
    }

    public String listProvider2(People people) {

        return new SQL(){{
            SELECT("*");
            FROM("people");
            WHERE("id = #{id}");
        }}.toString();
    }

}
