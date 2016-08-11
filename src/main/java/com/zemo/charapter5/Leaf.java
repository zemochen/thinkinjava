package com.zemo.charapter5;

/**
 * @ClassName: Leaf
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/10/14 9:23 AM
 * @Description ${TODO}
 */
public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println("i="+i);
    }

    public static void main(String[] args){
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
