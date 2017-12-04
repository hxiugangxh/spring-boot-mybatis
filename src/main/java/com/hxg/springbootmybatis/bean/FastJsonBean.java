package com.hxg.springbootmybatis.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class FastJsonBean {
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date date;

    @JSONField(serialize = false)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
