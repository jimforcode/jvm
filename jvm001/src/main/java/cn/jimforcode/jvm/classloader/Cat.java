package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/8.
 */
public class Cat {
    public Cat() {
        System.out.println("Cat is loaded by:"+getClass().getClassLoader());

    }
}
