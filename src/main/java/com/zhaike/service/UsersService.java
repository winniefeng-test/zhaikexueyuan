package com.zhaike.service;


import com.zhaike.entity.Users;

import java.util.List;

public interface UsersService {

    //服务层包含的方法--Users
    List<Users> getAllUsers();

    boolean validateUser(String uname, String pwd);


}
