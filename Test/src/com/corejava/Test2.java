package com.corejava;

public class Test2 {
    private static String name;
    private int age;
    public static void method(){
        name = "张三";
//        age = 23;   //在静态方法中无法使用非静态成员
        Test2 test = new Test2();
        test.age = 23; // 可以先创建对象再使用对象调用非静态成员
    }
}
