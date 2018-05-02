package cn.jimforcode.jvm.classloader;

import java.util.Collections;
import java.util.List;

/**
 * Created by jim on 2018/5/2.
 */
public class Demo {
    public static void main(String[] args) {
        List<Object> list= Collections.EMPTY_LIST;
        List<Object> list2= Collections.EMPTY_LIST;
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list==list2);
    }
}
