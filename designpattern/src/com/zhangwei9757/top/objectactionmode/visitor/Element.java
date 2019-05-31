package com.zhangwei9757.top.objectactionmode.visitor;

//抽象元素类
interface Element
{
    void accept(Visitor visitor);
}