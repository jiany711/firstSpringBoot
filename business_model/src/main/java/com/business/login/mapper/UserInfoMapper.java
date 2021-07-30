package com.business.login.mapper;

import com.business.login.pojo.UserInfo;

import java.util.List;

/**
 * @author 易健 071136540
 * @date 2021-7-29 17:44
 * @description
 */
public interface UserInfoMapper {
    List<UserInfo> selectUserInfos();
}
