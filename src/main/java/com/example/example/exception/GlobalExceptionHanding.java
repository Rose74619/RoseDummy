package com.example.example.exception;

import com.example.example.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHanding {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDetails> HandleExceptionResourceNotFound(ResourceNotFound ex) {
        ErrorDetails err = new ErrorDetails(ex.getMessage(), new Date());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> HandleExceptionResourceNotFound(Exception ex) {
        ErrorDetails err = new ErrorDetails(ex.getMessage(), new Date());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

    }
}


