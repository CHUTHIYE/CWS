package com.example.demo_csw.services;

import com.example.demo_csw.DTO.ResponseEntity;
import com.example.demo_csw.constant.CommonDefine;
import com.example.demo_csw.entity.Student;
import com.example.demo_csw.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;
    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseEntity getAllStudents() {
        ResponseEntity resp = new ResponseEntity();
        try {
            resp.setCode(CommonDefine.CodeSuccess);
            resp.setMsg(CommonDefine.Success);
            List<Object> students =List.of(studentRepository.findAll());
            resp.setData(students);
            return resp;
        }catch (Exception e){
            resp.setCode(CommonDefine.CodeError);
            resp.setMsg(e.getMessage());
            e.printStackTrace();
            return resp;
        }
    }

}
