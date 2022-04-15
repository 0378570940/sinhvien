package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.models.dto.StudentDetailDTO;
import com.example.demo.models.dto.StudentDto;
import com.example.demo.models.in.StudentIn;
import com.example.demo.models.out.StudentOut;
import com.example.demo.repositories.StudentRepositories;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepositories studentRepositories;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<?> create(StudentEntity studentEntity) {
        //lưu thông tin vào db
        StudentEntity studentEntity1 = studentMapper.createStudent(studentRepositories.save(studentEntity));
        //trả ra thông tin
        return new ResponseEntity<>(studentEntity1, HttpStatus.OK);
    }

    public ResponseEntity<?> update(long id, StudentIn studentIn) {
        //lấy thông tin từ trong db
        StudentEntity studentEntity = studentRepositories.findAllById(id);
        //kiểm tra nếu ko có thì trả ra kq
        if (studentEntity == null)
            return new ResponseEntity<>("không có bản ghi nào", HttpStatus.BAD_REQUEST);
        //cập nhập dữ liệu bản ghi
        studentMapper.updateStudent(studentEntity, studentIn);
        //lưu thông tin vào db
        studentRepositories.save(studentEntity);
        return new ResponseEntity<>("Sửa thành công", HttpStatus.OK);
    }

    public ResponseEntity<?> delete(long id) {
        try {
            //lấy thông tin trong db
            studentRepositories.deleteById(id);
            return new ResponseEntity<>("xóa thành công", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            //ko nhận đc thì trả ra kq
            return new ResponseEntity<>("không có bản ghi nào để xóa", HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<?> classEnter(String lop) {
        //lấy thông tin trong db
        List<StudentEntity> studentEntities = studentRepositories.findAllByMalop(lop);
        //ktra lếu ko có thì trả ra kq
        if (studentEntities == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        List<StudentEntity> studentEntities1 = studentEntities.stream()
                .filter(s -> Boolean.parseBoolean(s.getMalop()))
                .collect(Collectors.toList());
        modelMapper.map(studentEntities1, StudentDto.class);
        return new ResponseEntity<>(studentEntities, HttpStatus.OK);
    }

    public ResponseEntity<?> getInfoStudent(long id) {
        //lấy thông tin từ trong db
        StudentEntity studentEntity = studentRepositories.findAllById(id);
        StudentDetailDTO studentDetailDTO = new StudentDetailDTO();
        //ktra lếu ko có thì trả ra kq
        if(studentEntity == null)
            return new ResponseEntity<>("không có thông tin nào cả!",HttpStatus.BAD_REQUEST);
        //cập nhật dữ liệu bản ghi
        studentMapper.MoreInfoStudent(studentEntity, studentDetailDTO);
        StudentOut studentOut = new StudentOut();
        studentOut.setData(studentDetailDTO);
        return new ResponseEntity<>(studentOut, HttpStatus.OK);
    }
}
