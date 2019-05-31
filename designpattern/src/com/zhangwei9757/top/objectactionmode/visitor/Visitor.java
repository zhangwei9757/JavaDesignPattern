package com.zhangwei9757.top.objectactionmode.visitor;

//抽象访问者
interface Visitor
{
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}