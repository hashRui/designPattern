package Singleton;

/**
 * Created by 胡锐 on 2019/5/6.
 */
public class SingletonTest {

    public static void main(String[] args) {
        DoubleCheckSingleton.getInstance();

        InnerClassSingleton.getInstance();

        /**
         * 单例模式
         * 1、 私有化构造器
         * 2、 保证线程安全
         * 3、 延迟加载
         * 4、 防止序列化和反序列化破坏单例
         * 5、防御反射攻击单例
         */


    }

}
