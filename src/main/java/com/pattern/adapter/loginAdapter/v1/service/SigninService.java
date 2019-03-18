package com.pattern.adapter.loginAdapter.v1.service;

import com.pattern.adapter.loginAdapter.Member;
import com.pattern.adapter.loginAdapter.ResultMsg;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 7:14
 * @Version 1.0
 */
public class SigninService {

    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    public ResultMsg login(String username, String password) {
        return null;
    }

}
