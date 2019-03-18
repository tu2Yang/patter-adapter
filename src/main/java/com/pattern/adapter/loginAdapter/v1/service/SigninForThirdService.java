package com.pattern.adapter.loginAdapter.v1.service;

import com.pattern.adapter.loginAdapter.ResultMsg;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 7:18
 * @Version 1.0
 */
public class SigninForThirdService extends SigninService {

    public ResultMsg loginForQQ(String openId) {
        return this.loginForRegist(openId, null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, null);
        return super.login(username, null);
    }

}
