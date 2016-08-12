package com.zemo.charapter7;


/**
 * @ClassName: E20_FinalOverridingIllusion
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 8/12/16 10:37
 * @Description ${TODO}
 */
class WithFinal{
    public int i = 1;
    private final void f(){
        i += 10;
        System.out.println("WithFinal.f()"+i);
    }
    void g(){
        f();
        System.out.println("WithFinal.g()");
    }
    final void h() {
        System.out.println("WitFinal.h()");
    }
}

class OverridingPrivate extends WithFinal {
    private final void f() {
        i += 100;
        System.out.println("OverrideFinal.f()"+i); }    //can't compile
    @Override
    public void g() {
        f();
        System.out.println("OverrideFinal.g()"+i);
    } // OK, not final
    //private void h(); { System.out.println("OverrideFinal.h()"); } // cannot override private
}
public class E20_FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate op = new OverridingPrivate();
//        op.f();
        op.g();
        op.h();

    }
}
