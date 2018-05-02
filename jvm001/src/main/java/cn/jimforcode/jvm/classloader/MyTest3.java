package cn.jimforcode.jvm.classloader;


/***
 *    对于静态字段来说，只有直接定义了该字段的类才会被初始化
 *    当一个类再初始化时，要求其父类全部都已经初始化完毕了
 *    -XX:+TraceClassLoading : 追踪类的加载信息并打印出来
 *
 *     -XX:+<option> 开启
 *     -XX:-<option> 关闭
 *     -XX:-<option>=<value> 赋值
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyChild3.str);
        // Myparent3 static block
        // hello world

    }



}
class MyParent3{
    public static String str="hello world";
    static {
        System.out.println("Myparent3 static block");
    }
}

class MyChild3 extends MyParent3{
    public static String str2="wellcome";
    static {
        System.out.println("MyChild2 static block");
    }
}

