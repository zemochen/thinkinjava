package com.zemo.charapter5;

/**
 * @ClassName: Exercise9
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/10/14 3:31 PM
 * @Description ${TODO}
 */
public class Exercise9 {
    public Exercise9(String s) {
        System.out.println("s=" + s);
    }

    public Exercise9(int i) {
        this("i=" + i);
    }


    public static void main(String[] args) {
        new Exercise9("String call");
        new Exercise9(47);
    }
}
