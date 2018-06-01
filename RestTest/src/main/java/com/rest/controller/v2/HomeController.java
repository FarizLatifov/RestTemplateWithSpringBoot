package com.rest.controller.v2;

import com.rest.model.enums.ResultCodes;
import com.rest.model.response.ListResult;
import com.rest.model.response.StandardResult;
import com.rest.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//=====  VERSIONING BY EXTENDING CONTROLLER
@RestController
public class HomeController extends com.rest.controller.v1.HomeController {

    @Autowired
    CounterService counterService;


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public StandardResult getV2() {
        return new StandardResult(true, ResultCodes.SUCCESS.getCode(), "Successfully performed version 1");
    }


    @RequestMapping("/{total}/count")
    public ListResult<String> getCounterMessages(@PathVariable("total") int total) {
        return counterService.getCounterMessages(total);
    }


}
