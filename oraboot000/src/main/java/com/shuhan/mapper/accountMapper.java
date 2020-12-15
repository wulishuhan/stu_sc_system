package com.shuhan.mapper;

import com.shuhan.model.account;

public interface accountMapper {
    int deleteByPrimaryKey(String sno);

    int insert(account record);

    int insertSelective(account record);

    account selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(account record);

    int updateByPrimaryKey(account record);
}