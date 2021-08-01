package com.example.citest.controller;

import cn.hutool.json.JSONUtil;
import com.example.citest.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Teng
 */
@RestController
public class UserController {

    @RequestMapping("/ci-test/user/get")
    public String getUser(){
        User user = new User();
        user.setId(1000);
        user.setName("Jack");
        return JSONUtil.toJsonStr(user);
    }
}
