package cn.jimforcode.jvm.classloader1;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by jim on 2018/5/13.
 * 线程上下文类加载器的一般使用模式
 * 获取-使用-还原
 *    ClassLoader classLoader=  Thread.currentThread().getContextClassLoader();
 *  try{
 *         Thread.currentThread.setContextClassLoader(targetCcl);
 *         myMethod();
 *
 *
 *  }finally{
 *    Thread.currentThread.setContextClassLoader(classLoader);
 *  }
 *
 *  myMethod 里面则调用了  Thread.currentThread().getContextClassLoader();
 *  获取当前线程的上下文类加载器做某些事情。
 *  如果一个类由类加载器A加载，那么这个类的依赖类也是由相同的类加载器加载的
 *  （如果该依赖类之前没有被加载的话）
 *  ContextClassLoader 的作用就是为了破坏java 的类加载委托机制。
 *
 *
 *  当高层提供了统一的接口让底层去实现，同时又要在高层加载或实例化底层的类时，
 *  就必须要通过线程上下文类加载器来帮助高层的classloader找到并加载该类。
 *
 */
public class MyCL0 {


    public static void main(String[] args) {
        ServiceLoader<Driver> loader= ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator=loader.iterator();
        while (iterator.hasNext()){
            Driver driver=iterator.next();

            System.out.println("driver:"+driver.getClass() +",loader:"+driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文类加载器:"+Thread.currentThread().getContextClassLoader());
        System.out.println("serviceLoader的类加载器:"+ServiceLoader.class.getClassLoader());
    }





}
