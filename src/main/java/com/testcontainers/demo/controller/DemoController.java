package com.testcontainers.demo.controller;

import com.testcontainers.demo.model.DemoEntity;
import com.testcontainers.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/demo")
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/findAll")
    List<DemoEntity> findAll(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return demoService.findAll(pageNumber, pageSize);
    }

}
