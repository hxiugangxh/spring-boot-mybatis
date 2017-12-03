package com.hxg.springbootmybatis.dao;


import com.hxg.springbootmybatis.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<Student, Integer> {

}
