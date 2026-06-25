package com.cognizant;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Nishant");
        System.out.println("Setup executed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleanup executed");
    }

    @Test
    void testStudentName() {
        assertEquals("Nishant", student.getName());
    }

    @Test
    void testChangeName() {
        student.setName("Rahul");
        assertEquals("Rahul", student.getName());
    }
}