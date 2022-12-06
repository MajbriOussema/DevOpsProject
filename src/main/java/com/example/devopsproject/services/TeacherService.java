package com.example.devopsproject.services;
import com.example.devopsproject.models.Teacher;
import com.example.devopsproject.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository ownerRepository;

    public Teacher createTeacher(Teacher owner) throws Exception {

        Teacher createdTeacher = this.ownerRepository.save(owner);
        return createdTeacher;
    }

    public List<Teacher> getAllTeachers() throws Exception {

        List<Teacher> owners = this.ownerRepository.findAll();
        return owners;
    }

    public Teacher getTeacherById(Long ownerId) throws Exception {

        Optional<Teacher> ownerData = this.ownerRepository.findById(ownerId);
        if(ownerData.isPresent()){
            Teacher owner = ownerData.orElseThrow(()-> new Exception("owner not found"));
            return owner;
        }else{
            throw new  Exception("Teacher with this Id not found");
        }
    }
}
