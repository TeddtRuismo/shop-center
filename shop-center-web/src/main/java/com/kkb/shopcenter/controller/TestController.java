package com.kkb.shopcenter.controller;

import com.kkb.shopcenter.api.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("/hello")
    public String hellpworld(){
        return "hello every one";
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        String message = testService.getMessage();
        return message;
    }
}
