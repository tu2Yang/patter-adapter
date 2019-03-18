package com.pattern.adapter.loginAdapter.v2.adapters;

import com.pattern.adapter.loginAdapter.ResultMsg;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 7:28
 * @Version 1.0
 */
public class LoginForQQAdapter implements LoginAdapter {

    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object a) {
        return new ResultMsg(200, "登陆成功", "成功");
    }

}
