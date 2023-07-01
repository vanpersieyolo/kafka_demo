package com.example.kafkaexample.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {
    private String msgCode;
    private String msgInfo;

    public BaseResponse(String msgCode, String msgInfo) {
        this.msgCode = msgCode;
        this.msgInfo = msgInfo;
    }
}
