package com.service.demo01.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-28T03:11:33.970Z")

@RestSchema(schemaId = "demo01")
@RequestMapping(path = "/demo01", produces = MediaType.APPLICATION_JSON)
public class Demo01Impl {

    @Autowired
    private Demo01Delegate userDemo01Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDemo01Delegate.helloworld(name);
    }

}
