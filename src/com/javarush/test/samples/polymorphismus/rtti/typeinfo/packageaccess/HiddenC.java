package com.javarush.test.samples.polymorphismus.rtti.typeinfo.packageaccess;

import com.javarush.test.samples.polymorphismus.rtti.typeinfo.interfaces.A;

class C implements A
{
    public void f() {
        System.out.println("public C.f()"); }

    public void g() { System.out.println("public C.g()"); }

    void u() { System.out.println("package C.u()"); }

    protected void v() { System.out.println("protected C.v()"); }

    private void privateMethod() { System.out.println("private METHOD C.privateMethod()"); }
}

public class HiddenC {

    public static A makeA() { return new C(); }
}
