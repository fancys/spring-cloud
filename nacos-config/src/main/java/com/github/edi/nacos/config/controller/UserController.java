package com.github.edi.nacos.config.controller;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.github.edi.nacos.config.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author Fancy
 * @date 2019/12/24
 */
@RestController
@RefreshScope
public class UserController {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private Integer age;

    @Value("${log.level}")
    private String level;


    @GetMapping("user")
    public User getUser(){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
