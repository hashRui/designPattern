package proxy.jdkproxy.hrproxy;

/**
 * Created by 胡锐 on 2019/5/12.
 */
public class HRClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = HRClassLoader.class.getPackage().getName() + "." + name;

return null;

    }
}
