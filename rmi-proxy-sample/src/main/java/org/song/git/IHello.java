package org.song.git;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-09 9:14
 * To change
 */
public interface IHello extends Remote {

    /**
     * 简单的返回“Hello World！"字样
     * @return 返回“Hello World！"字样
     * @throws java.rmi.RemoteException
     */
    public String helloWorld() throws RemoteException;

    /**
     * 一个简单的业务方法，根据传入的人名返回相应的问候语
     * @param someBodyName  人名
     * @return 返回相应的问候语
     * @throws java.rmi.RemoteException
     */
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}