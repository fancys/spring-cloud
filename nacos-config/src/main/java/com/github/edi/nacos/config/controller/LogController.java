package com.github.edi.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fancy
 * @date 2019/12/24
 */
@RestController
@RefreshScope
public class LogController {

    @Value("${log.level}")
    private String logLevel;

    @Value("${log.path}")
    private String logPath;

    @GetMapping("log")
    public String getLogLevel(){
        return "level:"+ logLevel+";path:"+logPath;
    }
}
