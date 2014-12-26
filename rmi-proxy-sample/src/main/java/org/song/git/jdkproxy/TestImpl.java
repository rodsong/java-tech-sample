package org.song.git.jdkproxy;

import org.song.git.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-09 9:15
 * To change
 */
public class TestImpl implements ITest {

    public TestImpl() {
    }

    public String helloWorld(){
        System.out.println("Hello World!");
        return "Hello World!";
    }


    public String sayHelloToSomeBody(String someBodyName) {
        return "ÄãºÃ£¬" + someBodyName + "!";
    }
}
