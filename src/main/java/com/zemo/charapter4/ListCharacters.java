package com.zemo.charapter4;

/**
 * @ClassName: ListCharacters
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/2/14 10:35 AM
 * @Description ${TODO}
 */
public class ListCharacters {
    public static void main(String args[]) {
        for (char c = 0; c < 128; c++) {
            System.out.println("value=" + (int) c + ",character" + c);
        }
    }
}
