package com.example.demo_csw.repository;

import com.example.demo_csw.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
