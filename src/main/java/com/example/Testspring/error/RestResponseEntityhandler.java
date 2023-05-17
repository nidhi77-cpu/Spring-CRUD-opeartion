package com.example.Testspring.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.Testspring.entity.Errormessage;


@ControllerAdvice
@ResponseStatus
public class RestResponseEntityhandler  extends ResponseEntityExceptionHandler


{
	@ExceptionHandler(DepartmentNotFound.class)
  public  ResponseEntity <Errormessage> departmentNotFoundException(DepartmentNotFound exception , WebRequest request)
  {
	  Errormessage message = new Errormessage(HttpStatus.NOT_FOUND , exception.getMessage());
	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
  }
}

