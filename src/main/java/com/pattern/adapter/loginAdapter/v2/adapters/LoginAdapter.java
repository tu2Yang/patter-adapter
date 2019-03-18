package com.pattern.adapter.loginAdapter.v2.adapters;

import com.pattern.adapter.loginAdapter.ResultMsg;

/**
 * @Description
 * 在适配器中，这个接口可有可无
 * 模板模式一定是抽象类，而这里仅仅是一个接口
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 7:26
 * @Version 1.0
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object a);

}
