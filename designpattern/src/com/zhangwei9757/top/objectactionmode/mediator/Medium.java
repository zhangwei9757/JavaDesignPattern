package com.zhangwei9757.top.objectactionmode.mediator;

//抽象中介者：中介公司
interface Medium
{
    void register(Customer member); //客户注册
    void relay(String from,String ad); //转发
}