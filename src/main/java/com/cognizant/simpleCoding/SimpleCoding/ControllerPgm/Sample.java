package com.cognizant.simpleCoding.SimpleCoding.ControllerPgm;

import com.cognizant.simpleCoding.SimpleCoding.ServiceClass.StudentServiceClass;
import com.cognizant.simpleCoding.SimpleCoding.modelclass.StudentRegisteration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
}
