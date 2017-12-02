package com.hxg.springbootmybatis.dao;


import com.hxg.springbootmybatis.bean.People;
import com.hxg.springbootmybatis.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<Student, Integer> {

}
