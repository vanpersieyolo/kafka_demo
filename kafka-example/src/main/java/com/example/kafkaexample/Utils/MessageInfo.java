package com.example.kafkaexample.Utils;

public record MessageInfo(String code, String msg) {
    //Message Error
    public static final MessageInfo SERVER_ERROR = new MessageInfo("000000", "ERROR_OCCURS_DUE_TO_INVOKE_API");
    public static final MessageInfo AUTH_ERROR = new MessageInfo("000001", "AUTHENTICATION_FAILED");
    public static final MessageInfo REQUEST_INVALID = new MessageInfo("000002", "REQUEST_INVALID");
    public static final MessageInfo PARSE_INVALID = new MessageInfo("000003", "PARSE_INVALID");
    public static final MessageInfo ACCESS_DENIED = new MessageInfo("000004", "ACCESS_DENIED");
    public static final MessageInfo SIGNATURE_ERROR = new MessageInfo("000005", "SIGNATURE_ERROR");
    public static final MessageInfo JWT_INVALID_ERROR = new MessageInfo("000006", "JWT_INVALID_ERROR");
    public static final MessageInfo EXPIRED_JWT_ERROR = new MessageInfo("000007", "EXPIRED_JWT_ERROR");
    public static final MessageInfo UNSUPPORTED_JWT_ERROR = new MessageInfo("000008", "UNSUPPORTED_JWT_ERROR");
    public static final MessageInfo JWT_CLAIMS_IS_EMPTY_ERROR = new MessageInfo("000009", "JWT_CLAIMS_IS_EMPTY_ERROR");
    public static final MessageInfo SYNTAX_ERROR_FOR_BACKEND = new MessageInfo("000010", "SYNTAX_ERROR_FOR_BACKEND");
    public static final MessageInfo NULL_POINTER_ERROR = new MessageInfo("000011", "NULL_POINTER_ERROR");
    public static final MessageInfo REFRESH_TOKEN_INVALID = new MessageInfo("000012", "REFRESH_TOKEN_INVALID");
    public static final MessageInfo PARSE_FAILURE = new MessageInfo("000013", "PARSE_FAILURE");

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
