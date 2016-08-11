package com.zemo.charapter7;

/**
 * @ClassName: Exercise17
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 12/22/14 23:20
 * @Description ${TODO}
 */
public class Exercise17 {
    public static void main(String[] args) {
        Amphibian f = new Forg2();
        f.play();
    }
}
class Forg2 extends Amphibian{
    public void play() {
        System.out.println("Forg2 play called");
    }
}