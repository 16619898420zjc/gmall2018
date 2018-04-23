package com.atguigu.gmall1108.service;

import com.atguigu.gmall1108.bean.UserAddress;
import com.atguigu.gmall1108.bean.UserInfo;

import java.util.List;

public interface UserManageService {
    //day01
    public List<UserInfo> getUserInfoList(UserInfo userInfoQuery);
    public UserInfo getUserInfo(UserInfo userInfoQuery);
    public void delete(UserInfo userInfoQuery);
    public void addUserInfo(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);
    //day02
    public List<UserAddress> getUserAddressList(String userId);
}
