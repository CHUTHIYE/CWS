package com.example.demo_csw.services;

import com.example.demo_csw.DTO.ResponseEntity;
import com.example.demo_csw.constant.CommonDefine;
import com.example.demo_csw.repository.IClassroomRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService {
    @Autowired
    private IClassroomRespository classroomRespository;
//    public ClassroomService(IClassroomService classroomService) {
//        this.classroomRespository = classroomRespository;
//    }

    @Override
    public ResponseEntity getAllClassrooms() {
        ResponseEntity resp = new ResponseEntity();
        try {
            resp.setCode(CommonDefine.CodeSuccess);
            resp.setMsg(CommonDefine.Success);
            List<Object> classrooms =List.of(classroomRespository.findAll());
            resp.setData(classrooms);
            return resp;
        }catch (Exception e){
            resp.setCode(CommonDefine.CodeError);
            resp.setMsg(e.getMessage());
            return resp;
        }
    }
}
