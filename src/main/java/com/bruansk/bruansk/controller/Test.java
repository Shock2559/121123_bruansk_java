package com.bruansk.bruansk.controller;

import com.bruansk.bruansk.entity.TestEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class Test {

    private final TestService testService;

    public Test(TestService testService) {
        this.testService = testService;
    }

    @CrossOrigin
    @RequestMapping("/all-test")
    public ResponseEntity<List<TestEntity>> getAllTestEntity() {
        return new ResponseEntity<>(testService.getAllTestEntity(), HttpStatus.OK);
    }


}
