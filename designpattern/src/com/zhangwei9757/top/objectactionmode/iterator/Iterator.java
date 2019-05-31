package com.zhangwei9757.top.objectactionmode.iterator;

//抽象迭代器
interface Iterator
{
    Object first();
    Object next();
    boolean hasNext();
}