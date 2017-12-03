package com.hxg.springbootmybatis.dao;

import com.hxg.springbootmybatis.bean.People;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import javax.websocket.server.PathParam;
import java.util.List;

@Component
public interface MyBatisDao {

    @Select("select * from PEOPLE")
    public List<People> list();

    @Insert("insert into PEOPLE values(null, #{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int save(People people);

    @Select("select * from PEOPLE")
    List<People> selectByPage(Integer pn, Integer pageSize);

    @Select("select * from PEOPLE where name like concat('%', #{name}, '%')")
    List<People> mySelect(@Param("name") String name);

    @Select("select * from PEOPLE where name like '%${name}%'")
    List<People> mySelect2(@Param("name") String name);
}
