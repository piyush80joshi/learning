package com.pj.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	 @ExceptionHandler(
	      Exception.class
	      )
	    public ResponseEntity<Object> handleBadRequest(Exception ex, WebRequest request) {
	        return handleExceptionInternal(ex, ex
	          .getLocalizedMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	    }
	
}
