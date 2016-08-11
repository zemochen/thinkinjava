package com.zemo.charapter5;

/**
 * @ClassName: ExplicitStatic
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/10/14 4:44 PM
 * @Description ${TODO}
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main:");
        Cups.cup1.f(99);
    }

//    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}

class Cup{
    Cup(int mark) {
        System.out.println("Cup("+mark+")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
class Cups{
    static Cup cup1, cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}
