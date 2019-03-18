package com.pattern.adapter.loginAdapter.v2;

import com.pattern.adapter.loginAdapter.ResultMsg;
import com.pattern.adapter.loginAdapter.v1.service.SigninService;
import com.pattern.adapter.loginAdapter.v2.adapters.LoginAdapter;
import com.pattern.adapter.loginAdapter.v2.adapters.LoginForQQAdapter;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 7:24
 * @Version 1.0
 */
public class PassportForThirdAdapter extends SigninService implements IPassportForThird {

    public ResultMsg loginForQQ(String id) {
        // 策略模式
        return processLogin(id, LoginForQQAdapter.class);
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    // 静态工厂模式
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
