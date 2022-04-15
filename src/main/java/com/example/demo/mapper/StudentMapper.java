package com.example.demo.mapper;

import com.example.demo.entity.ClassEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.models.dto.ClassDto;
import com.example.demo.models.dto.StudentDetailDTO;
import com.example.demo.models.dto.StudentDto;
import com.example.demo.models.in.StudentIn;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@SpringBootApplication
public class StudentMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public StudentEntity createStudent(StudentEntity studentEntity) {
        StudentDto studentDto = new StudentDto();
        studentDto.setName(studentEntity.getName());
        studentDto.setMalop(studentEntity.getMalop());
        studentDto.setAddress(studentEntity.getAddress());
        studentDto.setBirthday(studentEntity.getBirthday());
        studentDto.setFacebook(studentEntity.getFacebook());
        studentDto.setGender(studentEntity.getGender());
        studentDto.setInterests(studentEntity.getInterests());
        studentDto.setPhoneNumber(studentEntity.getPhoneNumber());
        studentDto.setGiaovien(studentEntity.getGiaovien());
        studentDto.setDtb(studentEntity.getDtb());
        return studentEntity;
    }

    public StudentEntity updateStudent(StudentEntity studentEntity, StudentIn studentIn) {
        studentEntity.setName(studentIn.getName());
        studentEntity.setAddress(studentIn.getAddress());
        studentEntity.setMalop(studentIn.getMalop());
        studentEntity.setBirthday(studentIn.getBirthday());
        studentEntity.setFacebook(studentIn.getFacebook());
        studentEntity.setGender(studentIn.getGender());
        studentEntity.setInterests(studentIn.getInterests());
        studentEntity.setPhoneNumber(studentIn.getPhoneNumber());
        studentEntity.setGiaovien(studentIn.getGiaovien());
        studentEntity.setDtb(studentIn.getDtb());
        return studentEntity;
    }

    public StudentEntity MoreInfoStudent(StudentEntity studentEntity, StudentDetailDTO studentDetailDTO) {
        studentDetailDTO.setName(studentEntity.getName());
        studentDetailDTO.setMalop(studentEntity.getMalop());
        studentDetailDTO.setPhoneNumber(studentEntity.getPhoneNumber());
        studentDetailDTO.setInterests(studentEntity.getInterests());
        studentDetailDTO.setGender(studentEntity.getGender());
        studentDetailDTO.setFacebook(studentEntity.getFacebook());
        studentDetailDTO.setLop(studentEntity.getLop());
        studentDetailDTO.setBirthday(studentEntity.getBirthday());
        studentDetailDTO.setAddress(studentEntity.getAddress());
        studentDetailDTO.setGiaovien(studentEntity.getGiaovien());
        studentDetailDTO.setDtb(studentEntity.getDtb());
        studentDetailDTO.setId(studentEntity.getId());
        return studentEntity;
    }

    public ClassEntity getClass(ClassEntity ClassEntity, ClassDto classDto) {
//        ClassEntity.setId(classDto.getId());
        ClassEntity.setName(classDto.getName());
        ClassEntity.setAddress(classDto.getAddress());
        ClassEntity.setMalop(classDto.getMalop());
        ClassEntity.setFacebook(classDto.getFacebook());
        ClassEntity.setPhoneNumber(classDto.getPhoneNumber());
        ClassEntity.setGiaovien(classDto.getGiaovien());
        ClassEntity.setDtb(classDto.getDtb());
        return ClassEntity;
    }
}
