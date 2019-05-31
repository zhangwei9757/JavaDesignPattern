package com.zhangwei9757.top.structmode.decorator;

/**
 * 抽象装饰角色
 */
class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}