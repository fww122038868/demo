package com.fww.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class DisController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("asd");
        ArrayList<Object> objects = new ArrayList<>();

        objects.add(5);

        return "fww hello world !";

    }

}
