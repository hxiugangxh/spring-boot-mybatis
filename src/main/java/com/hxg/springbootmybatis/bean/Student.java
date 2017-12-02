package com.hxg.springbootmybatis.bean;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "CM_STUDENT")
/*oracle
@SequenceGenerator(name = "girlSeq", allocationSize = 50, initialValue = 1, sequenceName = "SEQ_CM_STUDENT")*/
public class Student {
    @Id
    @GeneratedValue
    /*oracle
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stuSeq")*/
    private Integer stuId;
    private String stuName;
    private Integer stuAge;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
