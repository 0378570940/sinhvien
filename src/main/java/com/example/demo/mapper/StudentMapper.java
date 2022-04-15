package com.example.demo.mapper;

import com.example.demo.entity.StudentEntity;
import com.example.demo.models.dto.StudentDetailDTO;
import com.example.demo.models.dto.StudentDto;
import com.example.demo.models.in.StudentIn;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class StudentMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public StudentDto updateStudent(StudentDto studentDto, StudentIn studentIn) {
        studentDto.setName(studentIn.getName());
        studentDto.setAddress(studentIn.getAddress());
        studentDto.setMaLop(studentIn.getMalop());
        studentDto.setBirthday(studentIn.getBirthday());
        studentDto.setFacebook(studentIn.getFacebook());
        studentDto.setGender(studentIn.getGender());
        studentDto.setInterests(studentIn.getInterests());
        studentDto.setPhoneNumber(studentIn.getPhoneNumber());
        studentDto.setGiaovien(studentIn.getGiaovien());
        studentDto.setDtb(studentIn.getDtb());
        return studentDto;
    }


    public StudentDetailDTO moreInfoStudent(StudentDetailDTO studentDetailDTO, StudentIn studentIn) {
        studentDetailDTO.setName(studentIn.getName());
        studentDetailDTO.setMalop(studentIn.getMalop());
        studentDetailDTO.setPhoneNumber(studentIn.getPhoneNumber());
        studentDetailDTO.setInterests(studentIn.getInterests());
        studentDetailDTO.setGender(studentIn.getGender());
        studentDetailDTO.setFacebook(studentIn.getFacebook());
        studentDetailDTO.setLop(studentIn.getLop());
        studentDetailDTO.setBirthday(studentIn.getBirthday());
        studentDetailDTO.setAddress(studentIn.getAddress());
        studentDetailDTO.setGiaovien(studentIn.getGiaovien());
        studentDetailDTO.setDtb(studentIn.getDtb());
        studentDetailDTO.setId(studentIn.getId());
        return studentDetailDTO;
    }
}
