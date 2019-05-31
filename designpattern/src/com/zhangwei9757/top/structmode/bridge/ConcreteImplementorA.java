package com.zhangwei9757.top.structmode.bridge;

/**
 * 具体实现化角色
 */
class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}