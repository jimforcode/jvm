package cn.jimforcode.jvm.classloader;


/***
 *    对于静态字段来说，只有直接定义了该字段的类才会被初始化
 *    当一个类再初始化时，要求其父类全部都已经初始化完毕了
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyChild2.str2);
        //  Myparent2 static block
        //  MyChild2 static block
        //  wellcome
    }



}

class MyParent2{
    public static String str="hello world";
    static {
        System.out.println("Myparent2 static block");
    }
}

class MyChild2 extends MyParent2{
    public static String str2="wellcome";
    static {
        System.out.println("MyChild2 static block");
    }
}
