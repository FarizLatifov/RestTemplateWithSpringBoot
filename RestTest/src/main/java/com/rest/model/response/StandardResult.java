package com.rest.model.response;


public class StandardResult {


    private boolean success;
    private int resultCode;
    private String message;


    public StandardResult(boolean success, int resultCode, String message) {
        this.success = success;
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "StandardResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", resultCode=" + resultCode +
                '}';
    }
}
