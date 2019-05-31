package com.zhangwei9757.top.objectactionmode.mediator;

//抽象中介者
abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}