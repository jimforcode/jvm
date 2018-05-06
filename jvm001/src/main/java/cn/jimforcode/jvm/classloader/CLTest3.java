package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/6.
 */
public class CLTest3 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while (classLoader!=null){
            classLoader=classLoader.getParent();
            System.out.println(classLoader);
        }


        ClassLoader classLoader1=Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader1);

    }
}
