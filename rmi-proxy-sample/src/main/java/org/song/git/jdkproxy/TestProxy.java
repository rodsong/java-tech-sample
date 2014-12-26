package org.song.git.jdkproxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-11 11:27
 * To change
 */

public class TestProxy {
    public static void main(String[] args) throws Exception {

        TestInvocationHandler h = new TestInvocationHandler();
        ITest model= (ITest)h.bind(new TestImpl());


        //这里可以通过运行结果证明model是Proxy的一个实例，这个实例实现了Imodel接口
        System.out.println(model instanceof Proxy);
        //这里可以看出model的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了Imodel接口
        System.out.println("model类是："+model.getClass().toString());

        System.out.print("model中的属性有：");
        Field[] field=model.getClass().getDeclaredFields();
        for(Field f:field){
            System.out.print(f.getName()+", ");
        }

        System.out.print("\n"+"model中的方法有：");

        Method[] method=model.getClass().getDeclaredMethods();

        for(Method m:method){
            System.out.print(m.getName()+", ");
        }

        System.out.println("\n"+"model的父类是："+model.getClass().getSuperclass());

        System.out.print("\n"+"model实现的接口是：");

        Class<?>[] interfaces=model.getClass().getInterfaces();

        for(Class<?> i:interfaces){
            System.out.print(i.getName()+", ");
        }

        System.out.println("\n\n"+"运行结果为：");
        model.helloWorld();

    }
}
