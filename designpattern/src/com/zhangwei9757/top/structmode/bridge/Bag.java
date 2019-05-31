package com.zhangwei9757.top.structmode.bridge;

abstract class Bag {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}