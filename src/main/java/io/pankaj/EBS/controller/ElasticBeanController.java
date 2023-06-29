package io.pankaj.EBS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElasticBeanController {

    @GetMapping("/status")
    public String deploy(){
        return "APPLICATION DEPLOYED TO AWS BEANSTACK...!!";
    }
}
