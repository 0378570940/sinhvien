package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.models.dto.StudentDto;
import com.example.demo.models.in.StudentIn;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PutMapping("student/{id}")
    public ResponseEntity<?> update(@PathVariable long id, @RequestBody StudentIn studentIn) {
        //lấy thông tin từ service
        return studentService.update(id, studentIn);
    }

    @DeleteMapping("student/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        //lấy thông tin từ service
        return studentService.delete(id);
    }


    @GetMapping("student/{id}")
    public ResponseEntity<?> getInfoStudent(@PathVariable(name = "id") long id) {
        //lấy thông tin từ service
        return studentService.getInfoStudent(id);
    }

    @GetMapping("student")
    public ResponseEntity<?> getClassInfo(@RequestParam(name = "ClassEnter") String lop) {
        //lấy thông tin từ service
        return studentService.getClassInfo(lop);
    }
}
