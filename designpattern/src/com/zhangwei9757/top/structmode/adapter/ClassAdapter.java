package com.zhangwei9757.top.structmode.adapter;

/**
 * 类适配器类
 */
class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}