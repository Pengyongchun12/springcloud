package com.pyc.springcloud.controller;


import com.pyc.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {


    @Autowired
    RestTemplate restTemplate;

    public static final String URL_INDEX_PREFIX = "http://localhost:8001/dept/query/";

    @GetMapping("dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return  restTemplate.getForObject(URL_INDEX_PREFIX+id,Dept.class);
    }
}
