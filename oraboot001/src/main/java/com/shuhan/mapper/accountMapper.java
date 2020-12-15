package com.shuhan.mapper;

import com.shuhan.model.account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface accountMapper {
    int deleteByPrimaryKey(String sno);

    int insert(account record);

    int insertSelective(account record);

    account selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(account record);

    int updateByPrimaryKey(account record);

    account findAccount(String sno,String pwd);
}