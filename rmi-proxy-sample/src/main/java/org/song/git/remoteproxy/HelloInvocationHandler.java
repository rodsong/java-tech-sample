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
     * 绑定委托对象并返回一个代理类
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.targetModel = target;
        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);   //要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)
    }

    @Override
    /**
     * 调用方法
     * proxy参数传递的即是 代理类的实例, 不是要代理的目标类对象
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result=null;
        System.out.println("代理开始");
        //执行方法
        result= method.invoke(targetModel, args);
        System.out.println("代理结束");
        return result;
    }

}
