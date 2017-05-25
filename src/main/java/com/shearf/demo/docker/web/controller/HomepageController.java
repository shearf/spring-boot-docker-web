package com.shearf.demo.docker.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiahaihu on 17/5/25.
 */
@RestController
public class HomepageController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping(value = {"", "/"})
    public String hello() {
        return "Hello World";
    }

    @GetMapping("name")
    public String index() {
        return applicationName;
    }
}
