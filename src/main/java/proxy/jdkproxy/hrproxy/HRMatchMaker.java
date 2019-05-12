package proxy.jdkproxy.hrproxy;

import proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 胡锐 on 2019/5/12.
 */
public class HRMatchMaker implements HRInvocationHandler{

    private Person target;

    public Object getInstance(Person person) throws Exception{
        this.target = person;
        Class<? extends Person> clazz = target.getClass();
        return HRProxy.newProxyInstance(new HRClassLoader() ,clazz.getInterfaces(),this);


    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxy,args);
    }
}
