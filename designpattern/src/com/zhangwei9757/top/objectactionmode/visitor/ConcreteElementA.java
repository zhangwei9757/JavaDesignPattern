package com.zhangwei9757.top.objectactionmode.visitor;

//具体元素A类
class ConcreteElementA implements Element
{
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationA()
    {
        return "具体元素A的操作。";
    }
}