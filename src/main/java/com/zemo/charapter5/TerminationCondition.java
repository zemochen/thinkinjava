package com.zemo.charapter5;

/**
 * @ClassName: TerminationCondition
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/10/14 4:03 PM
 * @Description ${TODO}
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}

class Book{
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }

}

