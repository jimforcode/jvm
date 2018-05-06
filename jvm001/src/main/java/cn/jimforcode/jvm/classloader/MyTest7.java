package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/5.
 *
 * 当一个接口在初始化时，并不要求其付姐口都完成了初始化(删除父接口验证)
 * 只有在真正使用到父接口的时候（如引用接口中所定义的常量时，才会初始化）
 */
public class MyTest7 {
    public static void main(String[] args) {
        System.out.println(MyChild7.b);
    }
}

interface MyParent7{
    public static int a=5;
}
interface MyChild7 extends MyParent7{
    public static int b=5;
}
