package com.zhangwei9757.top.objectactionmode.strategy;

//具体策略类B
class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}