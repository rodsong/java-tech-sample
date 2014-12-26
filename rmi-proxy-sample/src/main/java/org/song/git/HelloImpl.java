package org.song.git;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-09 9:15
 * To change
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {
    /**
     * ��ΪUnicastRemoteObject�Ĺ��췽���׳���RemoteException�쳣���������Ĭ�ϵĹ��췽������д�����������׳�RemoteException�쳣
     *
     * @throws RemoteException
     */
    public HelloImpl() throws RemoteException {
    }

    /**
     * �򵥵ķ��ء�Hello World��"����
     *
     * @return ���ء�Hello World��"����
     * @throws java.rmi.RemoteException
     */
    public String helloWorld(){
        System.out.println("Hello World!");
        return "Hello World!";
    }

    /**
     * һ���򵥵�ҵ�񷽷������ݴ��������������Ӧ���ʺ���
     *
     * @param someBodyName ����
     * @return ������Ӧ���ʺ���
     * @throws java.rmi.RemoteException
     */
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException {
        return "��ã�" + someBodyName + "!";
    }
}
