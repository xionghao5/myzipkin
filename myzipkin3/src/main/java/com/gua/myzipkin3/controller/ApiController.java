package com.gua.myzipkin3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class ApiController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String function() {
        String str = restTemplate.getForObject("http://127.0.0.1:9001", String.class);
        str += "myzipkin3";
        return str;
    }
}
