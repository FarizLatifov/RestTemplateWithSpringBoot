package com.rest.model.response;

import java.util.List;

public class ListResult<T> extends StandardResult {

    private int totalCount;
    private List<T> items;

    public ListResult(boolean success, int resultCode, String message) {
        super(success, resultCode, message);
    }


    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ListResult{" +
                "items=[" + items + "}" +
                +'}';
    }
}
