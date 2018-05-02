package cn.jimforcode.jvm.classloader;


/***
 *
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
        //  Myparent1 static block
        //  hello world
    }

}

class MyParent1{
    public static String str="hello world";
    static {
        System.out.println("Myparent1 static block");
    }
}

class MyChild1 extends MyParent1{
    static {
        System.out.println("MyChild1 static block");
    }
}
