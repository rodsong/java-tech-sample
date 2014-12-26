package org.song.git.jdkproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-09 9:14
 * To change
 */
public interface ITest  {

    public String helloWorld();


    public String sayHelloToSomeBody(String someBodyName);
}