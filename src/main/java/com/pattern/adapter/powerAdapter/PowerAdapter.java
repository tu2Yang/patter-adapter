package com.pattern.adapter.powerAdapter;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 6:54
 * @Version 1.0
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outPutDC5V() {
        int adapterInput = ac220.outPutAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("输入电流：" + adapterInput + "，输出电流：" + adapterOutput);
        return adapterOutput;
    }

}
