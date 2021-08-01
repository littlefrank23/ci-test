package com.example.mall.controller;

import cn.hutool.json.JSONUtil;
import com.example.mall.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Teng
 */
@RestController
public class DemoController {

    @RequestMapping("/demo/get-user")
    public String getUserInfo(){
        User user = new User();
        user.setUserId(1000);
        user.setUserName("Frank");
        return JSONUtil.toJsonStr(user);
        // test

    }
}
