package org.song.git;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-09 9:30
 * To change
 */
public class HelloClient {
    public static void main(String args[]){
        try {
            //��RMI����ע����в�������ΪRHello�Ķ��󣬲��������ϵķ���
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:8881/RHello");
            System.out.println(rhello instanceof Remote);
            System.out.println(rhello.helloWorld());
            System.out.println(rhello.sayHelloToSomeBody("����"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
