package com.bruansk.bruansk.controller;

import com.bruansk.bruansk.entity.TestEntity;
import com.bruansk.bruansk.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<TestEntity> getAllTestEntity() {
        return testRepository.my_getAllTestEntity();
    }

}

