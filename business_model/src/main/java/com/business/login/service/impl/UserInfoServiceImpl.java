package com.business.login.service.impl;

import com.business.login.mapper.UserInfoMapper;
import com.business.login.pojo.UserInfo;
import com.business.login.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 易健 071136540
 * @date 2021-7-29 18:42
 * @description
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectUserInfos() {
        return userInfoMapper.selectUserInfos();
    }

    @Override
    public void insertUserInfo(UserInfo userInfo) {

    }


}
