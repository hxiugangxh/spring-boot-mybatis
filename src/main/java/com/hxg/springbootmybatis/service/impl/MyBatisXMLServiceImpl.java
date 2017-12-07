package com.hxg.springbootmybatis.service.impl;

import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.dao.MyBatisXMLDao;
import com.hxg.springbootmybatis.service.MyBatisXMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("myBatisXMLService")
public class MyBatisXMLServiceImpl implements MyBatisXMLService {

    @Autowired
    private MyBatisXMLDao myBatisXMLDao;

    @Override
    public List<People> list() {
        System.out.println("myBatisXMLService");
        return myBatisXMLDao.list();
    }
}
