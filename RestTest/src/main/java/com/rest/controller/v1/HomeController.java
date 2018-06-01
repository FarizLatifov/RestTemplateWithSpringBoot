package com.rest.controller.v1;

import com.rest.model.enums.ResultCodes;
import com.rest.model.response.ListResult;
import com.rest.model.response.StandardResult;
import com.rest.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
 public class HomeController {

    @Autowired
    CounterService counterService;


    //=====VERSIONING BY PARAMETER=====start
    @RequestMapping(value = "/", method = RequestMethod.GET, params = "version=1")
    public StandardResult getV1(){
        return new StandardResult(true, ResultCodes.SUCCESS.getCode(), "Successfully performed version 1");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = "version=2")
    public StandardResult getV2(){
        return new StandardResult(true, ResultCodes.SUCCESS.getCode(), "Successfully performed version 2");
    }
    //=====VERSIONING BY PARAMETER=====end



    @RequestMapping("/{total}/count")
    public ListResult<String> getCounterMessages(@PathVariable("total") int total){
       return counterService.getCounterMessages(total);
    }


}
