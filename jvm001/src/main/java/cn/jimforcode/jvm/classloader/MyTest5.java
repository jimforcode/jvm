package cn.jimforcode.jvm.classloader;

import java.util.UUID;

/**
 * Created by jim on 2018/5/2.
 * 常量在编译阶段会存入到调用
 * 这个final常量的 方法所在类的常量池当中
 * 本质上，调用类并没有直接引用到定义常量的类，因此不会触发
 * 定义常量的类初始化
 *
 * 注意：这里指的是将常量存放到了MyTest4的常量池当中，之后MyTest4与
 * MyParent4就没有任何关系了
 *
 *
 *
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyParent5.str);
        // MyParent5 static block
        // random string
    }
}


class MyParent5{
    public static final String str= UUID.randomUUID().toString();
    static {
        System.out.println("MyParent5 static block");
    }
}
