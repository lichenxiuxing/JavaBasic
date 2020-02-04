package dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 21:02
 */
public class Test {
    public static void main(String[] args) {
        UserDao userDaoImpl=new UserDaoImpl();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler(userDaoImpl);
        //创建动态代理对象
        //proxy只能通过接口来实现动态代理
        //参数1：获取类加载器；参数2：获取此类实现的接口；参数3：引入动态代理
        UserDao proxy=(UserDao)Proxy.newProxyInstance(userDaoImpl.getClass().getClassLoader(),
                userDaoImpl.getClass().getInterfaces(),myInvocationHandler);
        //通过返回的动态代理对象，调用方法
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();
    }
}
