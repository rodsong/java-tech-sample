package org.song.git.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-12 12:45
 * To change
 */
public class BookFacadeCglib implements MethodInterceptor {

    /**
     * �����������
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        // �ص�����
        enhancer.setCallback(this);
        // �����������
        return enhancer.create();
    }

    @Override
    // �ص�����
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("���￪ʼ");
        proxy.invokeSuper(obj, args);
        System.out.println("�������");
        return null;

    }

}