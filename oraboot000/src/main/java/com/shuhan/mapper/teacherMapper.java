package com.shuhan.mapper;

import com.shuhan.model.teacher;

public interface teacherMapper {
    int deleteByPrimaryKey(String tno);

    int insert(teacher record);

    int insertSelective(teacher record);

    teacher selectByPrimaryKey(String tno);

    int updateByPrimaryKeySelective(teacher record);

    int updateByPrimaryKey(teacher record);
}