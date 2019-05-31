package com.zhangwei9757.top.structmode.bridge;

class HandBag extends Bag {
    @Override
    public String getName() {
        return color.getColor() + "HandBag";
    }
}