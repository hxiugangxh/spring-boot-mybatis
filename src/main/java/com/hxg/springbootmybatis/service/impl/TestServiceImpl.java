package com.hxg.springbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.dao.TestDao;
import com.hxg.springbootmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<People> list() {
        return testDao.list();
    }

    @Override
    public int save(People people) {
        return testDao.save(people);
    }

    @Override
    public List<People> selectByPage(Integer pn, Integer pageSize) {
        PageHelper.startPage(pn, pageSize);
        return testDao.selectByPage(pn, pageSize);
    }
}
