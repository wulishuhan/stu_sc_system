package com.shuhan.mapper;

import com.shuhan.model.st;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface stMapper {
    int insert(st record);

    int insertSelective(st record);

    st selectAllst(String sno);
}