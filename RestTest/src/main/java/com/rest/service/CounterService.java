package com.rest.service;

import com.rest.model.enums.ResultCodes;
import com.rest.model.response.ListResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CounterService {

    private static final String template = "Current counter number %s";
    private AtomicLong counter = new AtomicLong();

    public ListResult<String> getCounterMessages(int total) {
        ListResult<String> listResult = new ListResult<>(false, ResultCodes.ERROR.getCode(), "Error occured");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            list.add(String.format(template, counter.getAndIncrement()));
        }
        listResult.setTotalCount(list != null ? list.size() : 0);
        listResult.setSuccess(true);
        listResult.setResultCode(ResultCodes.SUCCESS.getCode());
        listResult.setMessage("Successfully calculated");
        listResult.setItems(list);
        return listResult;
    }
}
