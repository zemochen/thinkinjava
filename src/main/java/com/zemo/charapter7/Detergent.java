package com.zemo.charapter7;

/**
 * @ClassName: Detergent
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/14/14 11:17 PM
 * @Description ${TODO}
 */
public class Detergent extends Cleanser{
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
class Cleanser{
    private String s = "Cleanser";

    public void append(String s) {
        this.s += s;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}