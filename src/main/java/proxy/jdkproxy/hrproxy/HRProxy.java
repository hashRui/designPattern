package proxy.jdkproxy.hrproxy;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 该类用来生成代码，自己实现类加载器，自己编译
 * Created by 胡锐 on 2019/5/12.
 */
public class HRProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(HRClassLoader loader,
                                          Class<?>[] interfaces,
                                           HRInvocationHandler h){
        try {
            // 1、动态生成 java 代码
            String src = generateSre(interfaces);
            // 2、 将java文件输出到磁盘
            String filePath = HRProxy.class.getResource("").getPath();
            File f = new File(filePath + "Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);;
            fw.flush();
            fw.close();

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        } catch (Exception e){


        }


        return null;
    }

    private static String generateSre(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("import proxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("HRInvocationHandler h;" + ln);
        sb.append("public $Proxy0(GPInvocationHandler h) {" +ln);
            sb.append("this.h = h;");
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " "  + m.getName() + "(){" + ln);
                 sb.append("try {" + ln);
                 sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new class[]{});" + ln);
                 sb.append("this.h.invoke(this,m,null);" + ln);
                 sb.append("}catch(Throwable e){" + ln);
                 sb.append("e.printStackTrace();" + ln);
                 sb.append("}" + ln);
            sb.append("}");
        }

        sb.append("}");


        return sb.toString();
    }

}
