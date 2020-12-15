package com.shuhan.service.impl;

import com.shuhan.mapper.studentMapper;
import com.shuhan.model.student;
import com.shuhan.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    studentMapper studentMapper;

    @Override
    public List<student> findAllstudent() {
        return studentMapper.findAllstudent();
    }
}
