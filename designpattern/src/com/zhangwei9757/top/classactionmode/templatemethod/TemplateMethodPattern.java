package com.zhangwei9757.top.classactionmode.templatemethod;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();

        System.out.println("=====================模版方法测试结束=========================");
        System.out.println("=====================新测试出国留学=========================");
        StudyAbroad sa = new StudyInAmerica();
        sa.TemplateMethod();


        System.out.println("=====================钩子测试=========================");
        HookAbstractClass hac = new HookConcreteClass();
        hac.TemplateMethod();
    }
}