package com.demo.exception;

/**
 * Created by lihao on 16/9/28.
 */
public class LogonException extends RuntimeException {

    public LogonException(String message) {
        super(message);
    }

    public LogonException(String message, Throwable cause) {
        super(message, cause);
    }
}
