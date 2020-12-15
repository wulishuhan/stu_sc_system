package com.shuhan.mapper;

import com.shuhan.model.student;

import java.util.List;

public interface studentMapper {
    int deleteByPrimaryKey(String sno);

    int insert(student record);

    int insertSelective(student record);

    List selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);

    List findallstudent();

    List findallscore(Integer term);
}