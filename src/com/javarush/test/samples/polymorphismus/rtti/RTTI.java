package com.javarush.test.samples.polymorphismus.rtti;

/**
 * Created by prulov on 25.10.2016.
 */
public class RTTI {

    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };

        try{
            x[0].f();
            x[1].g();
            // Стадия компиляции- метод не найден в классе Useful:
            //! x[1].u();
            ((MoreUseful)x[1]).u(); // Нисх. преобразование /RTTI: Useful casted to MoreUseful
            ((MoreUseful)x[0]).u(); //При восход. преобраховании происходит исключение - types don't match each other
        }catch (ClassCastException cce){
            System.out.println("URAH!!! ClassCastException has been caught!!!");
        }

    }

    static class Useful {
        public void f() {}
        public void g() {}
    }

    static class MoreUseful extends Useful {
        public void f() {}
        public void g() {}
        public void u() {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.print("class name = " + stackTraceElements[2].getClassName() + ", ");
            System.out.println("line number = " + stackTraceElements[2].getLineNumber());
        }
        public void v() {}
        public void w() {}
    }
}
