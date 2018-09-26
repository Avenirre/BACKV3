package com.cvbank.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class ResponseSuccessList extends Response {

    //todo you should always use typized collections like List<SomeClass>
    private List data;

    public ResponseSuccessList(List data) {
        super(Response.SUCCESS,null,null);
        this.data = data;
    }
}



