package com.zhangwei9757.top.structmode.adapter;

public class ClassAdapterTest {
    public static void main(String[] args) {
        /*
            类适配器模式  Target  Adaptee ClassAdapter
         */
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}