package com.example.autodeploy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sController {

    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s <br/>111222 ";
    }
}
