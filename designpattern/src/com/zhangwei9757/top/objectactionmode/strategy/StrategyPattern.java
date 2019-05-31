package com.zhangwei9757.top.objectactionmode.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();

        System.out.println("----------------------------------");

        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();

        System.out.println("----------------------------------");

        MyTour myTour = new MyTour();
        TripMode tm = new ByCar();
        myTour.setTm(tm);
        tm.gotOut();

        tm = new ByTrain();
        myTour.setTm(tm);
        tm.gotOut();

        tm = new SelfDrive();
        myTour.setTm(tm);
        tm.gotOut();
    }
}