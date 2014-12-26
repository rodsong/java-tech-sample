project describe

1.  rmi demo

2. proxy implement rmi sample

与静态代理类对照的是动态代理类，动态代理类的字节码在程序运行时由Java反射机制动态生成，
无需程序员手工编写它的源代码。动态代理类不仅简化了编程工作，而且提高了软件系统的可扩展性，
因为Java 反射机制可以生成任意类型的动态代理类.
java.lang.reflect 包中的Proxy类和InvocationHandler 接口提供了生成动态代理类的能力。

生成的时候毕节码慢一些

TestProxy package, show how to proxy one class.
cglibproxy package, show how to cglib proxy .

3. 但是，JDK的动态代理依靠接口实现，
   如果有些类并没有实现接口，则不能使用JDK代理，这就要使用cglib动态代理了

   Cglib动态代理
   JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理，
   cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，
   但因为采用的是继承，所以不能对final修饰的类进行代理


4. 分步式，怎么实现远程服务代理执行？也就是怎么开发分布式服务.
   RMI:Java Remote Method Invocation
   它被设计成一种面向对象的通讯方式，允许程序员使用远程对象来实现通信，并且支持多线程的服务，
   这是一次远程通讯的革命，为远程通信开辟新的里程碑

RMI的开发步骤

1.先创建远程接口及声明远程方法，注意这是实现双方通讯的接口，需要继承一个远程接口扩展 java.rmi.Remote 接口
   每个远程接口里声明的方法除了声明抛出本身应用特定的异常之外，都要声明抛出 java.rmi.RemoteException 异常,否侧无法绑定服务。
2.开发一个类来实现远程接口及远程方法，值得注意的是实现类需要继承UnicastRemoteObject
   UnicastRemoteObject 类提供远程对象所需的基本行为。
   A、对这种对象的引用至多仅在创建该远程对象的进程生命期内有效
   B、使得远程对象既有使用TCP协议通信的能力(Socket)
   C、对于客户端与服务器的调用、传参、返回值等操作使用流的方式来处理
3.最后客户端查找远程对象，并调用远程方法







