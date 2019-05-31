package com.zhangwei9757.top.objectactionmode.strategy;

/**
 * Created by zw on 2019-5-30
 * <p>
 */
public class SelfDrive implements TripMode {
    @Override
    public void gotOut() {
        System.out.println("==========SelfDriver=============");
    }
}
