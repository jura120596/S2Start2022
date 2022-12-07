package com.example.s2start2022.test2.pack2;

import com.example.s2start2022.test2.pack1.ClassA;


public class ClassB extends ClassA {

    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ClassB cb = new ClassB();
        System.out.print(ca.str);
        System.out.print(cb.x);
    }
}
