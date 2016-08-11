package com.zemo.charapter5;

/**
 * @ClassName: PassingThis
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/10/14 9:27 AM
 * @Description ${TODO}
 */
public class PassingThis {
    public static void main(String[] main) {
        Apple apple = new Apple();
        System.out.println("main:"+apple.toString());
        new Person().eat(apple);
    }
}

class Person{
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("eat:"+peeled.toString());
        System.out.println("yummy");
    }
}

class Apple{
    Apple getPeeled() {
        System.out.println("getPeeled:"+this.toString());
        return Peeler.peel(this);
    }
}

class Peeler{
    static Apple peel(Apple apple) {
        System.out.println("peel:"+apple.toString());
        return apple;
    }
}