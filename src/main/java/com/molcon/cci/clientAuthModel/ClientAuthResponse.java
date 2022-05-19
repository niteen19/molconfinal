package com.molcon.cci.clientAuthModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Response Body //
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientAuthResponse<T> {
    int status;
    String message;
    T data;

}
