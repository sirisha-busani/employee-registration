package com.snipe.insurancemonster.auth.exception;

import static com.snipe.insurancemonster.auth.exception.HttpResponseUtils.prepareErrorResponse;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.snipe.insurancemonster.auth.common.GenericRes;

import jakarta.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class IMonExceptionHandler extends ResponseEntityExceptionHandler	 {
	
	@ExceptionHandler(BadCredentialsException.class)
	private ResponseEntity<GenericRes> handleBadCredentialsException(BadCredentialsException ex, WebRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("bad credentials");
		
		return prepareErrorResponse(ex,HttpStatus.SC_UNAUTHORIZED, "Invalid credentials.Please check the username and password");
	}
	
	@ExceptionHandler(UsernameNotFoundException.class)
	private ResponseEntity<GenericRes> handleException(UsernameNotFoundException ex, WebRequest request,
			HttpServletResponse response) throws Exception {
		return prepareErrorResponse(ex, HttpStatus.SC_UNAUTHORIZED);
	}
	
	@ExceptionHandler(Throwable.class)
	private ResponseEntity<GenericRes> handleException(Throwable ex, WebRequest request,
			HttpServletResponse response) throws Exception {
		return prepareErrorResponse(ex, HttpStatus.SC_INTERNAL_SERVER_ERROR);
	}

}
