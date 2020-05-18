package org.lic.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.lic.swagger.model.request.HelloGetRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZerlindaLi create at 2020/5/13 17:22
 * @version 1.0.0
 * @description HelloWorldController
 */
@RestController
@RequestMapping("/hello")
@Api(value = "Swagger实例", tags = "Swagger实例")
public class HelloWorldController {

    @ApiOperation(value = "get方式的hello world", notes = "get方式的hello world")
    @GetMapping("/get/hi")
    public String helloGet(HelloGetRequest request){
        return "Hello World! I'm " + request.getName();
    }

    @ApiOperation(value = "post方式的hello world", notes = "post方式的hello world")
    @PostMapping("/post/hi")
    public String helloPost(){
        return "Hello World!";
    }
}
