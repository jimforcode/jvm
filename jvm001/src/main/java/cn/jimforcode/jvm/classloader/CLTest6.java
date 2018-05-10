package cn.jimforcode.jvm.classloader;

/**
 * Created by zj on 2018/5/9 0009.
 * description:
 */
public class CLTest6 {
    public static void main(String[] args) {
        System.out.println("---------------------启动类加载器-------------------------------");
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println("---------------------拓展类加载器-------------------------------");
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println("---------------------系统类加载器-------------------------------");
        System.out.println(System.getProperty("java.class.path"));


        new Cat();
    }
}
