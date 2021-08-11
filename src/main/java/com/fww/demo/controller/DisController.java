package com.fww.demo.controller;

import com.fww.demo.bean.User;
import com.fww.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class DisController {


    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){

        ArrayList<Object> objects = new ArrayList<>();

        objects.add(5);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getPassword());
        return "fww hello world !";

    }

}
