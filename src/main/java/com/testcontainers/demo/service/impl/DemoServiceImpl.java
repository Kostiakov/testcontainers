package com.testcontainers.demo.service.impl;

import com.testcontainers.demo.model.DemoEntity;
import com.testcontainers.demo.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public List<DemoEntity> findAll() {
        return null;
    }

}
