package com.teste.projeto.handler;

import com.teste.projeto.model.error.ErrorMessage;
import com.teste.projeto.model.exception.ResourceNotFounException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ResourceNotFounException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFounException ex){
        ErrorMessage error = new ErrorMessage("Not Found", HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
