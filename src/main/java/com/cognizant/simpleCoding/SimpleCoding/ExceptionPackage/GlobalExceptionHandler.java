package com.cognizant.simpleCoding.SimpleCoding.ExceptionPackage;

import com.cognizant.simpleCoding.SimpleCoding.modelclass.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException
            (ResourceNotFoundException exception, WebRequest webreq)
    {
        ErrorMessage errorMessage=new ErrorMessage(exception.getMessage(),webreq.getDescription(false),new Date());
        return new ResponseEntity(errorMessage, HttpStatus.NOT_FOUND);


    }



}
