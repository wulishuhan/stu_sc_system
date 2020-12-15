package com.shuhan.mapper;

import com.shuhan.model.course;

import java.util.List;

public interface courseMapper {
    int deleteByPrimaryKey(String cno);

    int insert(course record);

    int insertSelective(course record);

    course selectByPrimaryKey(String cno);

    int updateByPrimaryKeySelective(course record);

    int updateByPrimaryKey(course record);

    List findallcourse();
}