package com.coupon.controller;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.coupon.dto.GenericResponseDTO;

public abstract class BaseController {
	private static final String SUCCESS = "Success";
	private static final String ERROR = "Error";
	
	protected ResponseEntity<GenericResponseDTO<Void>> buildNoContentResponse(){
		return buildResponse(HttpStatus.NO_CONTENT, SUCCESS, null);
	}
	
	protected ResponseEntity<GenericResponseDTO<Void>> buildTooManyRequest(){
		return buildResponse(HttpStatus.TOO_MANY_REQUESTS, ERROR, null);
	}
	
	protected <T> ResponseEntity<GenericResponseDTO<T>> forBiddenRequest(T data){
		return buildResponse(HttpStatus.FORBIDDEN, ERROR, data);
	}
	
	protected <T> ResponseEntity<GenericResponseDTO<T>> buildTooManyRequest(T data){
		return buildResponse(HttpStatus.TOO_MANY_REQUESTS, ERROR, data);
	}
	
	protected <T> ResponseEntity<GenericResponseDTO<T>> buildOkResponse(T data){
		return buildResponse(HttpStatus.OK, SUCCESS, data);
	}
	
	protected <T extends Collection<?>> ResponseEntity<GenericResponseDTO<T>> buildOkResponse(T data){
		return buildResponse(HttpStatus.OK, SUCCESS, data);
	}
	
	private <T> ResponseEntity<GenericResponseDTO<T>> buildResponse(HttpStatus status, String message, T data){
		return new ResponseEntity<>(GenericResponseDTO.build(status, message, data), status);
	}
	
}
