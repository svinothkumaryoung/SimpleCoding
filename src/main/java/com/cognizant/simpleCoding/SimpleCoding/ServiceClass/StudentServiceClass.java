package com.cognizant.simpleCoding.SimpleCoding.ServiceClass;

import com.cognizant.simpleCoding.SimpleCoding.Repository.RegisterationRepo;
import com.cognizant.simpleCoding.SimpleCoding.modelclass.StudentRegisteration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceClass {

    @Autowired
    RegisterationRepo registerationRepo;

    public StudentRegisteration addStudent(StudentRegisteration studentRegisteration){
        return registerationRepo.save(studentRegisteration);
    }



}
