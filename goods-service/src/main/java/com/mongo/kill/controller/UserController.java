package com.mongo.kill.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class UserController {

    @RequestMapping("t")
    public String get() {
        return "321231";
    }

}
