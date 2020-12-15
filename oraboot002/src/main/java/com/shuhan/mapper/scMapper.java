package com.shuhan.mapper;

import com.shuhan.model.sc;
import com.shuhan.model.scKey;
import com.shuhan.model.view.isc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface scMapper {

    List findallsclistinfo();

    int insertscinfo(sc sc);

    int iscontains(sc sc);

    List findallsclist();


}