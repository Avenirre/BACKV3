package com.cvbank.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class ResponseSuccessEmpty extends Response {

    //todo it's not nessassary to set data to null due to it is already null
    // when you create an object of the ResponseSuccessEmpty class
    public Object data = null;

    public ResponseSuccessEmpty() {

        super(Response.SUCCESS,null,null);
    }
}



