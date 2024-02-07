package com.novaexplore.springauth.controller;

import com.novaexplore.springbootauth.entity.User;
import com.novaexplore.springbootauth.model.UserModel;
import com.novaexplore.springbootauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class RegistrationController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel) {
        System.out.println(userModel);
        User user = userService.registerUser(userModel);
        return "Success";
    }
}
