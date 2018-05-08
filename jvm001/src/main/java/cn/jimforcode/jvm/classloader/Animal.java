package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/8.
 */
public class Animal {
    public Animal() {
        System.out.println("Animal is loaded by:"+getClass().getClassLoader());
        new Cat();
    }
}
