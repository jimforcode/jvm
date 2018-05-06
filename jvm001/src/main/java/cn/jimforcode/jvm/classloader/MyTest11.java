package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/6.
 */

class Parent11{
    static int a=3;
    static {
        System.out.println("parent11 static block.");
    }
    static void dosomething(){
        System.out.println("dosomething");
    }
}

class Child11 extends Parent11{
    static {
        System.out.println("child11 ");
    }
}

public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(Child11.a);
        System.out.println("------------");
        Child11.dosomething();
    }
}

