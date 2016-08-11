package com.zemo.charapter7;

/**
 * @ClassName: Wind
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 12/22/14 22:38
 * @Description Inheritance & upcasting
 * Wind Objcets are instruments because they have same interface
 */
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

class Instrument{
    public void play(){}
    static void tune(Instrument i){
        i.play();
    }
}
