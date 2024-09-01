package com.production.easypaste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.production.easypaste.entity.ContentEntity;
import com.production.easypaste.service.ContentService;



@RestController
@RequestMapping("/easypaste")
public class ContentController{

@Autowired
private ContentService service;

@PostMapping("/create")
public String submitPaste(@RequestBody ContentEntity body){
    
    return service.saveContent(body);




}



@GetMapping("/healthcheck")
    public String health(){

      return "All fine";
    }


@GetMapping("/id/{id}")
public String getPost(@PathVariable String id){
    
    return service.getPaste(id);




}









}