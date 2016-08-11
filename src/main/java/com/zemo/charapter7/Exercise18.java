package com.zemo.charapter7;

import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;

/**
 * @ClassName: Exercise18
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 12/24/14 22:25
 * @Description ${TODO}
 */
public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("First Object:");
        System.out.println(new WithFinalFields());
        System.out.println("Second Object:");
        System.out.println(new WithFinalFields());
    }
}
class SelfCount{
    private static int count;
    private int id = count++;

    @Override
    public String toString() {
        return "SelfCounter{" +
                "id=" + id +
                '}';
    }
}
class WithFinalFields{
    final SelfCount scf = new SelfCount();
    static final SelfCount sscf = new SelfCount();

    @Override
    public String toString() {
        return "WithFinalFields{" +
                "scf=" + scf + "\nsscf=" + sscf +
                '}';
    }
}