package com.zhaike.service.impl;

import com.zhaike.entity.Users;
import com.zhaike.entity.UsersExample;
import com.zhaike.mapping.UsersMapper;
import com.zhaike.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> getAllUsers() {
        UsersExample usersExample = new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }

    @Override
    public boolean validateUser(String uname, String pwd) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andPasswordEqualTo(pwd).andNicknameEqualTo(uname);
        List<Users> us = usersMapper.selectByExample(usersExample);
        return us.size() > 0 ?true : false;
    }

}
