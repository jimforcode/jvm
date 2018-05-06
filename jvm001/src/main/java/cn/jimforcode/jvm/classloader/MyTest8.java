package cn.jimforcode.jvm.classloader;

import java.util.Random;

/**
 * Created by jim on 2018/5/5.
 *
 *
 */
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(MyChild8.a);
    }
}
interface MyParent8{
    public static int a=5;
}
interface MyChild8 extends MyParent8{
    public static int b=new Random().nextInt(2);
}

