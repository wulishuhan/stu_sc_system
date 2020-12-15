package com.shuhan.mapper;

import com.shuhan.model.student;

public interface studentMapper {
    int deleteByPrimaryKey(String sno);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}