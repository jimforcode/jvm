package cn.jimforcode.jvm.classloader1;

/**
 * Created by jim on 2018/5/13.
 *
 *
 如果没有通过setContextClassLoader 进行设置的话，线程将继承其父线程的上下文
 类加载器。java 应用运行时的初始线程的上下文类加载器是 系统类加载器。
 在线程中运行的代码可以通过该类加载器来加载类与资源
 *
 *
 */
public class MyCL implements Runnable{
    private Thread thread;
    public MyCL(){
        thread = new Thread(this);

        System.out.println(thread);
        thread.start();
    }

    @Override
    public void run() {

        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);


        System.out.println("class: "+classLoader.getClass());
        System.out.println("parent "+classLoader.getParent().getClass());
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        new MyCL();
    }
}
