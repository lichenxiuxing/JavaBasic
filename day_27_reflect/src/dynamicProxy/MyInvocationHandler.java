package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Copyright LiChen
 * 用户：李晨
 * 创建时间：2020/2/3
 * 21:06
 */
public class MyInvocationHandler implements InvocationHandler {
    //通过内部维护一个目标对象，来对目标对象进行修饰
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    //proxy:经过处理的对象； method:处理对象将要调用的方法； args：处理对象调用方法的参数
    //invoke 方法是通过反射实现的
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代码检查");
        method.invoke(object,args);
        System.out.println("代码存储");
        //返回经过处理后的动态代理对象
        return proxy;
    }
}
