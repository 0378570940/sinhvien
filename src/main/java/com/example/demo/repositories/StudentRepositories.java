package com.example.demo.repositories;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositories extends JpaRepository<StudentEntity, Long> {
    StudentEntity findAllById(long id);

    List<StudentEntity> findAllByMalop(String lop);
}
