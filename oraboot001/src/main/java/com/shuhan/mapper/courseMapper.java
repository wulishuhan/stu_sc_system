package com.shuhan.mapper;

import com.shuhan.model.course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface courseMapper {
    int deleteByPrimaryKey(String cno);

    int insert(course record);

    int insertSelective(course record);

    course selectByPrimaryKey(String cno);

    int updateByPrimaryKeySelective(course record);

    int updateByPrimaryKey(course record);
}