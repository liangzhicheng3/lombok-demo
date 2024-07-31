package com.liangzhicheng.lombok.delegate;

import lombok.experimental.Delegate;

public class B {

    @Delegate //委托A类的方法
    private final A a = new A();

    public static void main(String[] args) {
        B b = new B();
        System.out.println("B实例调用A实例中方法");
        b.a();
    }

}