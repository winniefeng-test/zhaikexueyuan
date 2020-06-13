package com.zhaike.controller;

import com.zhaike.entity.Users;
import com.zhaike.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("new");
        mav.addObject("nums",100);
        return mav;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Users> getAll(){
        return usersService.getAllUsers();
    }

    //验证用户信息
    //允许跨域访问
    @CrossOrigin(origins = "*")
    @RequestMapping("/validate")
    @ResponseBody
    public String validate(String uname, String pwd){
        boolean b = usersService.validateUser(uname, pwd);
        usersService.getAllUsers();
        if(b){
            return "登陆成功!!";
        }else{
            return "登录失败!!";
        }
    }
}
