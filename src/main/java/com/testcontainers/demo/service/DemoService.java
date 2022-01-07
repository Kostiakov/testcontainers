package com.testcontainers.demo.service;

import com.testcontainers.demo.model.DemoEntity;

import java.util.List;

public interface DemoService {

    List<DemoEntity> findAll();

}
