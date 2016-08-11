package com.zemo.charapter3;

/**
 * @ClassName: PassObjecy
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/1/14 5:20 PM
 * @Description ${TODO}
 */
public class PassObject {
    static void f(Letter letter) {
        letter.c = 'z';
    }
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("1.letter.c=" + letter.c);
        f(letter);
        System.out.println("2.letter.c=" + letter.c);
    }


}
class Letter{
    char c;
}
