package cn.jimforcode.jvm.classloader;

/**
 * Created by jim on 2018/5/5.
 */
public class MyTest9 {
    public static void main(String[] args) {
        SingleTon singleTon =SingleTon.getInstance();
        System.out.println("count1:"+SingleTon.counter1);
        System.out.println("count2:"+SingleTon.counter2);

    }

}

class SingleTon{
    public static int counter1;
    private static SingleTon singleTon= new SingleTon();
    private SingleTon(){
        counter1++;
    }
    public static int  counter2=0;

    public static SingleTon getInstance(){
        return singleTon;
    }
}
