package com.zhangwei9757.top;

/**
 * @author
 * @date
 */
public class SignalLightEvent {
    public static void main(String[] args) {
        //交通信号灯（事件源）
        SignalLight light = new SignalLight();
        //注册监听器（轿车）
        light.addVehicleListener(new Car());
        //注册监听器（公交车）
        light.addVehicleListener(new Buses());

        light.changeColor("红色");

        System.out.println("------------");
        light.changeColor("绿色");
    }
}