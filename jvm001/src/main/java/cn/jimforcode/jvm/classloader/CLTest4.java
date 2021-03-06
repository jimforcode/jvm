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


     private String classloaderName;
     private final String fileExtension=".class";
     private String path;

    public void setPath(String path) {
        this.path = path;
    }

    public CLTest4(String classloadName) {
        super();
        this.classloaderName = classloadName;
    }

    public CLTest4(ClassLoader parent, String classloaderName) {
        super(parent);
        this.classloaderName = classloaderName;
    }


    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass invoked:"+className);
        System.out.println("classLoader:"+this.classloaderName);
        byte[] data= this.loadClassData(className);
        return this.defineClass(className,data,0,data.length);
    }

    private byte[] loadClassData(String name){
        System.out.println("loadClassData invoked:"+name);
        InputStream is = null;
        byte[] data=null;
        ByteArrayOutputStream baos = null;
        try{
            name=name.replace(".",File.separator);
             is= new FileInputStream(new File(this.path+name+this.fileExtension));
             baos= new ByteArrayOutputStream();
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



    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            CLTest4 test4 = new CLTest4("loader1");
            test4.setPath("G:\\");
        Class<?> clazz =test4.loadClass("cn.jimforcode.jvm.classloader.MyTest1");
        Object object = clazz.newInstance();
        System.out.println(object.getClass().getClassLoader());
        ;
    }



    @Override
    public String toString() {
        return "CLTest4{" +
                "classloaderName='" + classloaderName + '\'' +
                ", fileExtension='" + fileExtension + '\'' +
                '}';
    }
}
