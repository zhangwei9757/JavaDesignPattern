package com.zhangwei9757.top;

import java.util.EventListener;

/**
 * 抽象观察者类：车
 */
interface Vehicle extends EventListener {
    /**
     * 事件处理方法，看见
     * @param e
     */
    public void see(SignalColor e);
}