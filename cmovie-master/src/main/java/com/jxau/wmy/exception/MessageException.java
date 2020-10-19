package com.jxau.wmy.exception;


public class MessageException extends Exception {

    private String message;

    public MessageException() {
    }

    public MessageException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageException{" +
                "message='" + message + '\'' +
                '}';
    }
}