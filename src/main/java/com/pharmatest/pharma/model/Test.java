package com.pharmatest.pharma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @Column(name = "test_id")
    private Long id;

    @Column(name = "test_name")
    private String testName;

    @Column(name = "test_cost")
    private Double testCost;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public double getTestCost() {
        return testCost;
    }

    public void setTestCost(double testCost) {
        this.testCost = testCost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   

}
