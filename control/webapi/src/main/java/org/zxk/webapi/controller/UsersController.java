package org.zxk.webapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zxk.application.service.UsersService;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/userall")
    @ResponseBody
    String userAll(){
        usersService.findAll();
        return "ok";
    }
}
