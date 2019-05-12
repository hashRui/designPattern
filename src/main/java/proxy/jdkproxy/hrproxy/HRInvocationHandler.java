package proxy.jdkproxy.hrproxy;

import java.lang.reflect.Method;

/**
 * Created by 胡锐 on 2019/5/12.
 */
public interface HRInvocationHandler {


    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;

}
