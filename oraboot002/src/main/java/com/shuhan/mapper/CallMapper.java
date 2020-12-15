package com.shuhan.mapper;

import java.util.Map;

public interface CallMapper {
    //    public void queryEmp(Map map);
    //查询存储过程的方法
    public void callProcedure(Map map);
    //查询函数的方法
    public Map callFunction(Map map);
}