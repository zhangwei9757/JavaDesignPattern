package com.zhangwei9757.top.structmode.adapter;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        /*
            对象适配器模式  Target  Adaptee ObjectAdapter
         */
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}