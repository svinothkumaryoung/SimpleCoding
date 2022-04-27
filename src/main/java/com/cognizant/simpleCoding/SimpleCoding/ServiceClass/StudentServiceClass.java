package com.cognizant.simpleCoding.SimpleCoding.ServiceClass;

import com.cognizant.simpleCoding.SimpleCoding.Repository.RegisterationRepo;
import com.cognizant.simpleCoding.SimpleCoding.modelclass.StudentRegisteration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceClass {

    @Autowired
    RegisterationRepo registerationRepo;

    public StudentRegisteration addStudent(StudentRegisteration studentRegisteration){
        return registerationRepo.save(studentRegisteration);
    }

    public List<StudentRegisteration> viewStudents()
    {
        return registerationRepo.findAll();
    }

    public Optional<StudentRegisteration> viewStudent(int regi)
    {
        return registerationRepo.findById(regi);
    }

}
