package org.song.git.remoteproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-11 11:25
 * To change
 */
public class HelloInvocationHandler implements InvocationHandler {
    private Object targetModel;
    /**
     * ��ί�ж��󲢷���һ��������
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.targetModel = target;
        //ȡ�ô������
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);   //Ҫ�󶨽ӿ�(����һ��ȱ�ݣ�cglib�ֲ�����һȱ��)
    }

    @Override
    /**
     * ���÷���
     * proxy�������ݵļ��� �������ʵ��, ����Ҫ�����Ŀ�������
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result=null;
        System.out.println("����ʼ");
        //ִ�з���
        result= method.invoke(targetModel, args);
        System.out.println("�������");
        return result;
    }

}
