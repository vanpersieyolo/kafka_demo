package com.example.kafkaexample.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponse extends BaseResponse{
    private String rootCause;

    public ExceptionResponse(String msgCode, String msgInfo, String rootCause) {
        super(msgCode, msgInfo);
        this.rootCause = rootCause;
    }

    public ExceptionResponse(String msgCode, String msgInfo) {
        super(msgCode, msgInfo);
    }
}
