package com.example.reservation.handler;

import com.example.reservation.dto.ErrorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(UNAUTHORIZED)
    @ExceptionHandler(value = { AuthenticationException.class})
    @ResponseBody
    protected ErrorDto badRequest(RuntimeException ex, ServletRequest request) {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        String requestURI = httpServletRequest.getRequestURI();

        return new ErrorDto(UNAUTHORIZED.value(), ex.getMessage(), requestURI);
    }

}