package cn.jimforcode.jvm.classloader;

import jdk.internal.util.xml.impl.Input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by jim on 2018/5/6.
 */
public class CLTest4 extends ClassLoader{


     private String classloadName;
     private final String fileExtension=".class";

    public CLTest4(String classloadName) {
        super();
        this.classloadName = classloadName;
    }

    public CLTest4(ClassLoader parent, String classloadName) {
        super(parent);
        this.classloadName = classloadName;
    }


    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        byte[] data= this.loadClassData(className);
        return this.defineClass(className,data,0,data.length);
    }

    private byte[] loadClassData(String name){
        InputStream is = null;
        byte[] data=null;
        ByteArrayOutputStream baos = null;
        try{
            this.classloadName= this.classloadName.replace(",","/");
            is= new FileInputStream(new File(name+this.fileExtension));
            int ch=0;
            while (-1!=(ch=is.read())){
                baos.write(ch);
            }
           data=baos.toByteArray();
        }catch (Exception e){

        }finally {
            try {
                is.close();
                baos.close();
            }catch (Exception e){

            }
        }
        return data;
    }

     public static void  test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz =classLoader.loadClass("cn.jimforcode.jvm.classloader.CL");
        Object object = clazz.newInstance();
        System.out.println(object);
    }


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            CLTest4 test4 = new CLTest4("loader1");
          test(test4);
    }
















    @Override
    public String toString() {
        return "CLTest4{" +
                "classloadName='" + classloadName + '\'' +
                ", fileExtension='" + fileExtension + '\'' +
                '}';
    }
}
