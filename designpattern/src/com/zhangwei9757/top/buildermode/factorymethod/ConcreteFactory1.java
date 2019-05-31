package com.zhangwei9757.top.buildermode.factorymethod;

/**
 * Created by zw on 2019-5-30
 * <p>
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
