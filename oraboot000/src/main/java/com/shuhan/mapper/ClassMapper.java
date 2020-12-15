package com.shuhan.mapper;

import com.shuhan.model.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(String clno);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(String clno);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}