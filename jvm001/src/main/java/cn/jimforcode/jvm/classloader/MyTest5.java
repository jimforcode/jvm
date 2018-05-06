package cn.jimforcode.jvm.classloader;

import java.util.UUID;

/**
 * Created by jim on 2018/5/5.
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyParent5.str);
    }
}
class MyParent5{
    public static final String str= UUID.randomUUID().toString();
    static {
        System.out.println("MyParent5 static block");
    }
}