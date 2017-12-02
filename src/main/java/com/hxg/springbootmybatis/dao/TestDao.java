package com.hxg.springbootmybatis.dao;

import com.hxg.springbootmybatis.bean.People;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestDao {

    @Select("select * from PEOPLE")
    public List<People> list();

    @Insert("insert into PEOPLE values(null, #{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int save(People people);

    @Select("select * from PEOPLE")
    List<People> selectByPage(Integer pn, Integer pageSize);
}
