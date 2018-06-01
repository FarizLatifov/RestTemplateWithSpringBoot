package com.rest.model.request;

public class ByIdRequest extends StandartRequest {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
