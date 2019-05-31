package com.zhangwei9757.top.buildermode.prototype;

import java.util.Scanner;

/**
 * Created by zw on 2019-5-30
 * <p>
 */
public class Circle implements Shape {
    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (Exception e) {
            System.out.println("拷贝圆失败!");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }
}
