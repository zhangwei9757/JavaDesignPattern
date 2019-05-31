package com.zhangwei9757.top.objectactionmode.observer;

//具体观察者2
class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}