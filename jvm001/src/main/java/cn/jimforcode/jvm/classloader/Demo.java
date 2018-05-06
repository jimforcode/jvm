package cn.jimforcode.jvm.classloader;

import java.util.Collections;
import java.util.List;

/**
 * Created by jim on 2018/5/2.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Demo2.str);
    }
}
class Demo1{
    static String str="xxxxx";
    static{
        System.out.println("Demo1 ............");
    }
}

class Demo2 extends Demo1{
    static {
        System.out.println("Demo2 .............");
    }
}
