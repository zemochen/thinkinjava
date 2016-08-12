package com.zemo.charapter7;

/**
 * @ClassName: E24_Scarab
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 8/12/16 11:40
 * @Description ${TODO}
 */
class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");
}

public class E24_Scarab extends Beetle {
    private int n = printInit("Scarab.n initialized");
    public E24_Scarab() {
        System.out.println("n = " + n);
        System.out.println("j = " + j);
    }
    private static int x3 = printInit("static Scarab.x3 initialized");
    public static void main(String[] args) {
        System.out.println("Scarab constructor");
        E24_Scarab sc = new E24_Scarab();
    }
}
