package com.hxg.springbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.dao.MyBatisDao;
import com.hxg.springbootmybatis.service.MyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("myBatisService")
public class MyBatisServiceImpl implements MyBatisService {

    @Autowired
    private MyBatisDao myBatisDao;

    @Override
    public List<People> list() {
        return myBatisDao.list();
    }

    @Override
    public int save(People people) {
        return myBatisDao.save(people);
    }

    @Override
    public List<People> selectByPage(Integer pn, Integer pageSize) {
        PageHelper.startPage(pn, pageSize);
        return myBatisDao.selectByPage(pn, pageSize);
    }

    @Override
    public List<People> mySelect(String name) {
        return myBatisDao.mySelect(name);
    }

    @Override
    public List<People> mySelect2(String name) {
        return myBatisDao.mySelect2(name);
    }
}
