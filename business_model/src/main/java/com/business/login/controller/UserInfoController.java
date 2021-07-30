package com.business.login.controller;

import com.business.login.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 易健 071136540
 * @date 2021-7-29 18:45
 * @description
 */
@RestController
@Slf4j
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/user/queryUserInfos")
    public Object queryUserInfos(){
        return userInfoService.selectUserInfos();
    }
}
