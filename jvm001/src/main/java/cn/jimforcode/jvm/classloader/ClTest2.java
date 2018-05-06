package cn.jimforcode.jvm.classloader;


/**
 * Created by jim on 2018/5/6.
 *
 * 调用ClassLoader 类的loadClass 方法加载一个类，并不是对类的主动使用，不会导致类的初始化
 */
class CL{
    static {
        System.out.println("Class CL");
    }
}

public class ClTest2 {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = loader.loadClass("cn.jimforcode.jvm.classloader.CL");
        System.out.println(clazz);
        System.out.println("----------------");
        clazz=Class.forName("cn.jimforcode.jvm.classloader.CL");
        System.out.println(clazz);

    }

}
