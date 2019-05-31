package com.zhangwei9757.top.objectactionmode.state;

//具体状态A类
class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}