package com.business.login.service;

import com.business.login.pojo.UserInfo;

import java.util.List;

/**
 * @author 易健 071136540
 * @date 2021-7-29 18:42
 * @description
 */
public interface UserInfoService {
    List<UserInfo> selectUserInfos();
}
