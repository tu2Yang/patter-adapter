package com.pattern.adapter.loginAdapter;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 7:13
 * @Version 1.0
 */
public class ResultMsg {

    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
