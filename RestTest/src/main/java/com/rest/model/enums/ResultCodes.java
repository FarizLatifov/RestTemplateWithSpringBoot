package com.rest.model.enums;

public enum ResultCodes {

    SUCCESS(0),
    ERROR(1);

    private int code;

    private ResultCodes(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
