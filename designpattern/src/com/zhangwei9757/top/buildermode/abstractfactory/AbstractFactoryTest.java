package com.zhangwei9757.top.buildermode.abstractfactory;


/**
 * @author zw
 * @date 2019-5-30
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        try {
            AbstractFactory factory = new ConcreteFactory1();
            Product product1 = factory.newProduct1();
            product1.show();

            factory = new ConcreteFactory2();
            Product product2 = factory.newProduct2();
            product2.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}