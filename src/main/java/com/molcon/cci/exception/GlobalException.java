package com.molcon.cci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler
    public  ResponseEntity<ErrorObject> handleInvalidIpException(InvalidIpException ex){
        ErrorObject eObject= new ErrorObject();
        eObject.setStatusCode(HttpStatus.UNAUTHORIZED.value());
        eObject.setMessage("InvalidIP");
        return new ResponseEntity<ErrorObject>(eObject,HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler
    public  ResponseEntity<ErrorObject> handleInvalidDocKeyException(InvalidDocVec ex){
        ErrorObject eObject= new ErrorObject();
        eObject.setStatusCode(HttpStatus.BAD_REQUEST.value());
        eObject.setMessage("Doc key not found");
        return new ResponseEntity<ErrorObject>(eObject,HttpStatus.BAD_REQUEST);
    }
}
