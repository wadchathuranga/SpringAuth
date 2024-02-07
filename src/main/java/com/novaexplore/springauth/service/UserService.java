package com.novaexplore.springauth.service;


import com.novaexplore.springauth.entity.User;
import com.novaexplore.springauth.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
