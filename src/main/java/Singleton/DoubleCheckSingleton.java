package Singleton;

/**
 * Created by 胡锐 on 2019/5/6.
 */
public class DoubleCheckSingleton {

    private static volatile  DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){
        System.out.println("双重检测创建单例");
    }

    // 使用双重检测 + 锁 + volitele 保证初始化安全，来保证线程安全
    public static DoubleCheckSingleton getInstance(){
        if (singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }



}

