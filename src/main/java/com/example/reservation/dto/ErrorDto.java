package com.example.reservation.dto;

import lombok.Getter;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ErrorDto {
    private final int status;
    private final String message;
//    private List<FieldError> fieldErrors = new ArrayList<>();
    private final String path;

    public ErrorDto(int status, String message, String path) {
        this.status = status;
        this.message = message;
        this.path = path;
    }



//    public void addFieldError(String objectName, String path, String message) {
//        FieldError error = new FieldError(objectName, path, message);
//        fieldErrors.add(error);
//    }

//    public List<FieldError> getFieldErrors() {
//        return fieldErrors;
//    }
}