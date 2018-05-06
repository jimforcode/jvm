package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/5.
 */
public class MyTest6 {

    public static void main(String[] args) {
        MyParent6[] myParent6s= new MyParent6[1];
        // 没有任何输出， 没有导致类的初次使用，及没有被初始化
        System.out.println(myParent6s.getClass());
        // class [Lcn.jimforcode.jvm.classloader.MyParent6;  此类型是运行期 jvm 创建的
        MyParent6[][] myParent6ss= new MyParent6[1][1];// 对于数组来说，javaDoc 经常将构成数组的元素为Component，实际上就是将数组降低一个维度后的类型
        System.out.println(myParent6ss.getClass());// class [[Lcn.jimforcode.jvm.classloader.MyParent6;
        System.out.println(myParent6ss.getClass().getSuperclass());//class java.lang.Object




    }

}
class MyParent6 {

    static {
        System.out.println("MyParent6 static block ");
    }

}

