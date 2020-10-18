package com.wf.training.sba3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AttendeeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AttendeeNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
