package com.zhangwei9757.top.buildermode.abstractfactory;

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂2生成-->具体产品11...");
        return new Product1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂2生成-->具体产品22...");
        return new Product2();
    }
}