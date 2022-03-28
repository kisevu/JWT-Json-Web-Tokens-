package com.ameda.kevin.controller;

import com.ameda.kevin.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private static final List<Student> STUDENTS= Arrays.asList(
            new Student(1,"kevin ameda kisevu"),
            new Student(2,"chrispas wambua muema"),
            new Student(3,"fred wandabwa wekesa")
    );
    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()->new IllegalStateException("student with id "+studentId+" not found."));
    }
}
