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

    //sửa thông tin trong db theo id
    public ResponseEntity<?> update(long id, StudentIn studentIn) {
        //lấy thông tin từ trong db
        StudentEntity studentEntity = studentRepositories.findAllById(id);
        //chuyển đổi thực thể thành dto
        StudentDto studentDto = modelMapper.map(studentEntity, StudentDto.class);
        //kiểm tra nếu ko có thì trả ra kq
        if (studentEntity == null)
            return new ResponseEntity<>("không có bản ghi nào", HttpStatus.BAD_REQUEST);
        //cập nhập dữ liệu bản ghi
        studentMapper.updateStudent(studentDto, studentIn);
        //lưu thông tin vào db
        studentRepositories.save(studentEntity);
        return new ResponseEntity<>("Sửa thành công", HttpStatus.OK);
    }

    //xoa thông tin theo id
    public ResponseEntity<?> delete(long id) {
        try {
            //xóa thông tin trong db
            studentRepositories.deleteById(id);
            return new ResponseEntity<>("xóa thành công", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            //ko nhận đc thì trả ra kq
            return new ResponseEntity<>("không có bản ghi nào để xóa", HttpStatus.BAD_REQUEST);
        }
    }

    //lấy thong tin của một sinh viên theo lop
    public ResponseEntity<?> getClassInfo(String lop) {
        //lấy thông tin trong db
        List<StudentEntity> studentEntities = studentRepositories.findAllByMalop(lop);
        //ktra lếu ko có thì trả ra kq
        if (studentEntities == null)
            return new ResponseEntity<>("không có thông tin nào", HttpStatus.BAD_REQUEST);
        List<StudentEntity> studentEntities1 = studentEntities.stream()
                .filter(s -> Boolean.parseBoolean(s.getMalop()))
                .collect(Collectors.toList());
        modelMapper.map(studentEntities1, StudentDto.class);
        StudentOut studentOut = new StudentOut();
        studentOut.setData(studentEntities);
        return new ResponseEntity<>(studentOut, HttpStatus.OK);
    }

    //lấy thông tin của một sinh viên theo id
    public ResponseEntity<?> getInfoStudent(long id) {
        //lấy thông tin từ trong db
        StudentEntity studentEntity = studentRepositories.findAllById(id);
        //chuyển đổi thực thể thành DTO
        StudentIn studentIn = modelMapper.map(studentEntity, StudentIn.class);
        StudentDetailDTO studentDetailDTO = modelMapper.map(studentEntity, StudentDetailDTO.class);
        //ktra lếu ko có thì trả ra kq
        if (studentEntity == null)
            return new ResponseEntity<>("không có thông tin nào cả!", HttpStatus.BAD_REQUEST);
        //cập nhật dữ liệu bản ghi
        studentMapper.moreInfoStudent(studentDetailDTO, studentIn);
        StudentOut studentOut = new StudentOut();
        studentOut.setData(studentDetailDTO);
        return new ResponseEntity<>(studentOut, HttpStatus.OK);
    }
}
