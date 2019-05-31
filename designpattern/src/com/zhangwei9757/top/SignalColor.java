package com.zhangwei9757.top;

import java.util.EventObject;

/**
 * 信号灯颜色
 */
class SignalColor extends EventObject {
    /**
     * "红色"和"绿色"
     */
    private String color;

    public SignalColor(Object source, String color) {
        super(source);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}