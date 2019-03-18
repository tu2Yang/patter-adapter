package com.pattern.adapter.powerAdapter;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 6:56
 * @Version 1.0
 */
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outPutDC5V();
    }

}
