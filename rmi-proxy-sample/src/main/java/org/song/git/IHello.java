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
     * �򵥵ķ��ء�Hello World��"����
     * @return ���ء�Hello World��"����
     * @throws java.rmi.RemoteException
     */
    public String helloWorld() throws RemoteException;

    /**
     * һ���򵥵�ҵ�񷽷������ݴ��������������Ӧ���ʺ���
     * @param someBodyName  ����
     * @return ������Ӧ���ʺ���
     * @throws java.rmi.RemoteException
     */
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}