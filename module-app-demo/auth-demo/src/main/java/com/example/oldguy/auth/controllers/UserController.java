package com.example.oldguy.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Author: huangrenhao
 * @Description:
 * @CreateTime： 2020/1/13 0013 下午 11:07
 * @Version：
 **/
@RestController
public class UserController {

    @GetMapping("/test")
    public String test() {

        return "auth-demo";
    }
}
