package com.pharmatest.pharma.service;

import java.util.List;

import com.pharmatest.pharma.model.Test;

public interface TestService {
    List<Test> getAllTests();
    Test getTestById(Long id);
    Test saveTest(Test test);
    void deleteTestById(Long id);
}