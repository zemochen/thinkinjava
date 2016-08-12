package com.zemo.charapter7;

import com.sun.org.apache.bcel.internal.generic.LoadClass;

/**
 * @ClassName: E23_LoadClass
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date: 8/12/16 11:42
 * @Description:  Prove that class loading takes place only once. Prove that loading may be caused
 *              by either the creation of the first instance of the that class of by access of a
 *              static member.
 * @Output:A.j initialized
 *          B.k initialized
 *          LoadClass.i constructor
 *          ----------start----------
 *          A() constructor
 *          B() constructor
 *          E23_LoadClass() constructor
 *          C.n initialized
 *          A() constructor
 *          com.zemo.charapter7.A@1f26ecd2
 *          D() constructor
 */
class A{
    static int j = printInit("A.j initialized");

    A() {
        System.out.println("A() constructor");
    }

    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }
}

class B extends A {
    static int k = printInit("B.k initialized");
    B(){
        System.out.println("B() constructor");
    }
}
class C {
    static int n = printInitC("C.n initialized");
    static A a = new A();
    C(){
        System.out.println("C() constructor");
    }
    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }

}
class D{
    D(){
        System.out.println("D() constructor");
    }
}
public class E23_LoadClass extends B{
    static int i = printInit("LoadClass.i constructor");
    E23_LoadClass() {
        System.out.println("E23_LoadClass() constructor");
    }

    public static void main(String[] args) {
        System.out.println("----------start----------");
        E23_LoadClass lc = new E23_LoadClass();
        System.out.println(C.a);
        D d = new D();
    }
}
