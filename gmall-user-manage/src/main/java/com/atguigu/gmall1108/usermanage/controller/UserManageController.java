package com.atguigu.gmall1108.usermanage.controller;

import com.atguigu.gmall1108.usermanage.bean.UserInfo;
import com.atguigu.gmall1108.usermanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserManageController {
    @Autowired
    UserManageService userManageService;
    @RequestMapping("/getUserInfoList")
    public ResponseEntity<List<UserInfo>> getUserInfoList(UserInfo userInfo){
        List<UserInfo> userInfoList = userManageService.getUserInfoList(userInfo);
        return ResponseEntity.ok().body(userInfoList);
    }





}
