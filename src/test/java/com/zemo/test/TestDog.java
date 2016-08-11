package com.zemo.test;

/**
 * @ClassName: Animal
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 4/19/16 13:06
 * @Description ${TODO}
 */
class Animal{

    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{

    public void move(){
        System.out.println("Dogs can walk and run");
    }
    public void bark(){
        System.out.println("Dogs can bark");
    }
}

public class TestDog{

    public static void main(String args[]){
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object

        a.move();// runs the method in Animal class
        b.move();//Runs the method in Dog class
        System.out.println(1 << 2);
        System.out.println(16 >> 2);
    }
}
