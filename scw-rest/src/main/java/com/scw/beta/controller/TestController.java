package com.scw.beta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String defaultGet() {
        return "Hello and welcome to Shoulda Coulda Woulda";
    }
}
