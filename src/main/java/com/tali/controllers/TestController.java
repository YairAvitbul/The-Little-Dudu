package com.tali.controllers;

import com.tali.entities.TestEntity;
import com.tali.repositories.ITestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tests")
public class TestController {

    @Autowired
    private ITestRepository testRepository;

    @PostMapping
    public void createTest(@RequestBody TestEntity testEntity) {
        testRepository.save(testEntity);
    }

    @PutMapping
    public void updateTest(@RequestBody int id) {
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable("id") long id) {
        testRepository.deleteById(id);
    }
}
