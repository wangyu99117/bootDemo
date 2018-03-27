package com.wangyu.demo.controller;

import com.wangyu.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wangyu21 on 2018/3/27.
 */
@RestController("/")
public class BootController {

    @Resource
    private TestService testService;

    @RequestMapping
    public void test(){
        testService.app();
    }
}
