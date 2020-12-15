package com.shuhan.mapper;

import com.shuhan.model.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface studentMapper {
    int deleteByPrimaryKey(String sno);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);

    List<student> findAllstu();
}