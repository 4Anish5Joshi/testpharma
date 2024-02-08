package com.pharmatest.pharma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pharmatest.pharma.model.Test;
import com.pharmatest.pharma.repositories.TestRepository;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public Test getTestById(Long id) {
        return testRepository.findById(id).orElse(null);
    }

    @Override
    public Test saveTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public void deleteTestById(Long id) {
        testRepository.deleteById(id);
    }
}