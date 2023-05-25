package com.kompheak.java.phoneShop.exception;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@RequiredArgsConstructor
public class APIException extends RuntimeException{

    private final HttpStatus status;
    private final String message;

}
