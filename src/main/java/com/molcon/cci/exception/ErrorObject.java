package com.molcon.cci.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorObject {
    private Integer statusCode;
    private String message;
}
