package com.example.demo.models.out;

import com.example.demo.models.dto.StudentDto;

public class StudentOut {
    private Object data;

    public StudentOut() {
    }

    public StudentOut(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
