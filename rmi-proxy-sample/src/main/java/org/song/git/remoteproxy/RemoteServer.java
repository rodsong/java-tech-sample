package org.song.git.remoteproxy;

import org.song.git.HelloImpl;
import org.song.git.IHello;
import org.song.git.jdkproxy.ITest;
import org.song.git.jdkproxy.TestImpl;
import org.song.git.jdkproxy.TestInvocationHandler;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-09 9:09
 * To change
 */
public class RemoteServer {
    public static void main(String args[]) {
        try {
            //创建一个远程对象
//            IHello model=new HelloImpl();
            HelloInvocationHandler ih = new HelloInvocationHandler();
            IHello model= (IHello)ih.bind(new HelloImpl());
            model.helloWorld();


            LocateRegistry.createRegistry(8889);
            Naming.bind("rmi://localhost:8889/RHello",model);
            System.out.println(">>>>>INFO:远程IHello对象绑定成功！");
        } catch (RemoteException e) {
            System.out.println("创建远程对象发生异常！");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("发生URL畸形异常！");
            e.printStackTrace();
        }
    }
}