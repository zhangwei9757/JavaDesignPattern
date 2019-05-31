package com.zhangwei9757.top.objectactionmode.state;

//具体状态B类
class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}