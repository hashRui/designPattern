package Singleton;

/**
 * Created by 胡锐 on 2019/5/6.
 */
// 没用到 synchronized 关键字 性能最优
public class InnerClassSingleton {

    // 虽然构造方法被私有了，但可能被反射
    private InnerClassSingleton(){
        System.out.println("通过静态内部类创建单例");
    }

    private static class LazyHolder{
        private static final InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return LazyHolder.SINGLETON;
    }

}
