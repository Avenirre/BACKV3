package com.cvbank.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class ResponseError extends Response {

    //todo it's not nessassary to set data to null due to it is already null
    // when you create an object of the ResponseSuccessEmpty class
    private Object data = null;

    public ResponseError(Integer code, String message) {

        super(Response.ERROR, code, message);
    }
}



