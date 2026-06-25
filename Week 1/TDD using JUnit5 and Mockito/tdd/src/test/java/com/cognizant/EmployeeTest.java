package com.cognizant;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Before All Tests");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("After All Tests");
    }

    @BeforeEach
    void setUp() {
        employee = new Employee("John");
        System.out.println("Before Each Test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Test");
    }

    @Test
    void testEmployeeName() {
        assertEquals("John", employee.getName());
    }

    @Test
    void testUpdateEmployeeName() {
        employee.setName("David");
        assertEquals("David", employee.getName());
    }
}