package cn.jimforcode.jvm.classloader;

import java.util.Random;

/**
 * Created by jim on 2018/5/5.
 */
public class MyTest10 {
    public static void main(String[] args) {
        System.out.println(MyChild10.b);
    }
}

interface MyParent10{
    public static Thread thread = new Thread(){
        {
            System.out.println("MyParent10 invoked!");
        }
    };
}
class MyChild10 implements MyParent10{
    static int b= 5;
}