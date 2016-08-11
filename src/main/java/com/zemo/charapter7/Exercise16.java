package com.zemo.charapter7;

/**
 * @ClassName: Exercise16
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 12/22/14 23:10
 * @Description ${TODO}
 */
public class Exercise16 {
    public static void main(String[] args) {
        Amphibian f = new Forg();
        Amphibian.tune(f);
    }
}

class Amphibian{

    public void play(){
        System.out.println("play called");
    }
    static void tune(Amphibian a){
        System.out.println("tune called");
        a.play();
    }
}

class Forg extends Amphibian{

}