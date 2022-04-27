package com.cognizant.simpleCoding.SimpleCoding.ControllerPgm;

import com.cognizant.simpleCoding.SimpleCoding.ExceptionPackage.ResourceNotFoundException;
import com.cognizant.simpleCoding.SimpleCoding.ServiceClass.StudentServiceClass;
import com.cognizant.simpleCoding.SimpleCoding.modelclass.StudentRegisteration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/SampleCode")
public class Sample {

    @Autowired
    StudentServiceClass studentServiceClass;

   @PostMapping("/addStudent")
    public StudentRegisteration addData
           (@RequestBody StudentRegisteration studentRegi)
   {
       return studentServiceClass.addStudent(studentRegi);
   }

   @GetMapping("/ViewStudent")
    public List<StudentRegisteration> getStudentsDetails()
   {
       return studentServiceClass.viewStudents();
   }

   @GetMapping("/ViewStudent/{id}")
    public Optional<StudentRegisteration> getStudentDetails
           (@PathVariable (value ="id") int regNo)
   {
       return studentServiceClass.viewStudent(regNo);
   }
    @PutMapping("/UpdateData/{id}")
    public StudentRegisteration updateData
            (@PathVariable (value ="id") int regNo,
             @RequestBody StudentRegisteration sr)
    {
        StudentRegisteration oldRecords=
                studentServiceClass.viewStudent(regNo)
                        .orElseThrow(()->new ResourceNotFoundException("Register Number Not Found "+regNo));


        oldRecords.setEmailid(sr.getEmailid());
        oldRecords.setName(sr.getName());
        oldRecords.setMobileNo(sr.getMobileNo());
        return  studentServiceClass.addStudent(oldRecords);
    }

}
