package com.example.kafkaexample.exception;

import com.example.kafkaexample.Utils.MessageInfo;
import com.example.kafkaexample.dto.ExceptionResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionResponse> exceptionHandler(HttpServletRequest request, CustomException e) {
        ExceptionResponse error = new ExceptionResponse(
                MessageInfo.SERVER_ERROR.getCode(), MessageInfo.SERVER_ERROR.getMsg(), e.getError());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    @ExceptionHandler(value = JsonProcessingException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionResponse> exceptionHandler() {
        ExceptionResponse error = new ExceptionResponse(
                MessageInfo.PARSE_FAILURE.getCode(), MessageInfo.PARSE_FAILURE.getMsg(), "Parse data failure");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

}
