package com.pattern.adapter.loginAdapter.v2;

import com.pattern.adapter.loginAdapter.ResultMsg;

/**
 * @Description 只扩展
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 7:22
 * @Version 1.0
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String id);

    ResultMsg loginForWechat(String id);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String telphone, String code);

    ResultMsg loginForRegist(String username, String passport);
}
