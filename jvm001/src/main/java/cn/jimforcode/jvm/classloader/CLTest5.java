package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/8.
 */
public class CLTest5 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        CLTest4 test4 = new CLTest4("loader1");
        test4.setPath("G:\\");
        Class<?> clazz =test4.loadClass("cn.jimforcode.jvm.classloader.Animal");
        Object object = clazz.newInstance();
        System.out.println(object.getClass().getClassLoader());

    }
}
