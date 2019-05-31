package com.zhangwei9757.top.structmode.bridge;

/**
 * 抽象化角色
 */
abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}