package com.zhangwei9757.top.buildermode.abstractfactory;

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new Product1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 1 生成-->具体产品 22...");
        return new Product2();
    }
}