package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/6.
 */
public class CLTest1
{
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> clazz =Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());;
        Class<?> cclazz =Class.forName("cn.jimforcode.jvm.classloader.C");
        System.out.println(cclazz.getClassLoader());
    }
}
class C{

}