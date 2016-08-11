package com.zemo.charapter5;

/**
 * @ClassName: OrderOfInitialization
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/10/14 4:26 PM
 * @Description ${TODO}
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f();

    }

}

class Window{
    Window(int marker) {
        System.out.println("window("+marker+")");
    }
}
class House{
    Window w1 = new Window(1);
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}