package com.javarush.test.samples.polymorphismus.rtti.typeinfo;

import com.javarush.test.samples.polymorphismus.rtti.typeinfo.interfaces.A;

class B implements A {
    public void f() {}
    public void g() {
        System.out.println("!Method g() execution by B-object!");
    }
}

public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // // Ошибка компиляции
        System.out.println(a.getClass().getName());
        if(a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}
