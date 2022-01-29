package com.testcontainers.demo.service.impl;

import com.testcontainers.demo.model.DemoEntity;
import com.testcontainers.demo.service.DemoService;
import com.testcontainers.demo.storage.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    private final DemoRepository demoRepository;

    @Override
    public List<DemoEntity> findAll(Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return demoRepository.findAll(pageable).getContent();
    }

}
