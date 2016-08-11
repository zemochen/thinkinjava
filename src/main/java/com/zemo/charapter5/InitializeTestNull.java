package com.zemo.charapter5;

/**
 * @ClassName: InitializeTestNull
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/5/14 12:35 AM
 * @Description ${TODO}
 */
public class InitializeTestNull {
    String s = new String();

    InitializeTestNull() {
        System.out.println("The Class is Initialized"+s);
    }
    static int test(Object... objects){return 1;}
    static int test(Object object){return 2;}

    public static void main(String[] args) {
        InitializeTestNull init = new InitializeTestNull();
        test(new Object());
    }

}
