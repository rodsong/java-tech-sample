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


        //�������ͨ�����н��֤��model��Proxy��һ��ʵ�������ʵ��ʵ����Imodel�ӿ�
        System.out.println(model instanceof Proxy);
        //������Կ���model��Class����$Proxy0,���$Proxy0��̳���Proxy��ʵ����Imodel�ӿ�
        System.out.println("model���ǣ�"+model.getClass().toString());

        System.out.print("model�е������У�");
        Field[] field=model.getClass().getDeclaredFields();
        for(Field f:field){
            System.out.print(f.getName()+", ");
        }

        System.out.print("\n"+"model�еķ����У�");

        Method[] method=model.getClass().getDeclaredMethods();

        for(Method m:method){
            System.out.print(m.getName()+", ");
        }

        System.out.println("\n"+"model�ĸ����ǣ�"+model.getClass().getSuperclass());

        System.out.print("\n"+"modelʵ�ֵĽӿ��ǣ�");

        Class<?>[] interfaces=model.getClass().getInterfaces();

        for(Class<?> i:interfaces){
            System.out.print(i.getName()+", ");
        }

        System.out.println("\n\n"+"���н��Ϊ��");
        model.helloWorld();

    }
}
