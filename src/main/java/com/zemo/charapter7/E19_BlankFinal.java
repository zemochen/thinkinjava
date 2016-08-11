package com.zemo.charapter7;

/**
 * @ClassName: E19_BlankFinal
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 8/10/16 22:38
 * @Description ${TODO}
 */
public class E19_BlankFinal {
    private final Poppet poppet;       //Line A

    public E19_BlankFinal() {
        poppet = new Poppet(1);     //without this line Line A will error
    }

    public E19_BlankFinal(int i) {
        poppet = new Poppet(i);     //without this line Line A will error
    }

    public static void main(String[] args) {
        E19_BlankFinal b1 = new E19_BlankFinal();
        E19_BlankFinal b2 = new E19_BlankFinal(23);
        //b1.poppet = new Poppet(1);    //Errors :cannot assign values
        System.out.println("b1.poppet:" + b1.poppet);
        System.out.println("b2.poppet:" + b2.poppet);
    }
}

class Poppet {
    private int i;

    public Poppet(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Poppet" + i;
    }
}