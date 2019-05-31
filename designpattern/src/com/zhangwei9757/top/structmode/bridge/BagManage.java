package com.zhangwei9757.top.structmode.bridge;

public class BagManage {
    public static void main(String[] args) {
        Color color = new Red();
        Bag bag = new Wallet();
        bag.setColor(color);
        String description = String.format("包包颜色类型：是：%s", bag.getName());
        System.out.println(description);
    }
}