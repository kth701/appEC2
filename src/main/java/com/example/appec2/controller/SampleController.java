package com.example.appec2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {
    @RequestMapping("/getArr")
    public String[]  getArr() {
        return new String[]{"Hello, EC2 Instance!", "안녕하세요, EC2 인스턴스!"};
    }

}
