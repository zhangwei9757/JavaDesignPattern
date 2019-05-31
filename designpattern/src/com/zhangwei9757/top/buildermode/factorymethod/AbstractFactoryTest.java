package com.zhangwei9757.top.buildermode.factorymethod;

/**
 * @author zw
 * @date 2019-5-30
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        try {
            AbstractFactory af = new ConcreteFactory1();
            Product a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}