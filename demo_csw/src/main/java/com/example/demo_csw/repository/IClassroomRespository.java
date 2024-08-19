package com.example.demo_csw.repository;

import com.example.demo_csw.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassroomRespository extends JpaRepository<Classroom, Long> {
}
