package com.zhangwei9757.top.structmode.adapter;

/**
 * 适配者接口
 */
class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}