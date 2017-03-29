package com.ajitkbaral.springboot.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajit Kumar Baral
 */
@RestController
@RequestMapping("/")
public class DefaultController {
    @RequestMapping(method = RequestMethod.GET)
    public String defualt(){
        return "Hello";
    }
    
}
