package com.zemo.charapter3;

/**
 * @ClassName: Assignment
 * @author: SuperZemo
 * @email: zemochen@gmail.com
 * @Date 10/1/14 3:43 PM
 * @Description ${TODO}
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 0xf;//16进制的整形数据用前缀为0x加0~9或a~f表实，8进制前缀为0加0~8的数字表实
        System.out.println("1:t1=" + t1.level + ",t2=" + t2.level);
        t1 = t2;
        System.out.println("1:t1=" + t1.level + ",t2=" + t2.level);
        t1.level = 27;
        System.out.println("1:t1=" + t1.level + ",t2=" + t2.level);
    }
}
class Tank{
    int level;
}
class FloatTank{
    float proportion;
}