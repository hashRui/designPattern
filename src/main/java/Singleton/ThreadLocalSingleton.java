package Singleton;

/**
 * Created by 胡锐 on 2019/5/7.
 */

// ThreadLocal 是伪线程安全
// 可以使用 ThreadLocal 来实现多数据源动态切换
// 手写ORM框架可以实现多数据源
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){

    };


    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL =
            new ThreadLocal<ThreadLocalSingleton>() {
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }};

    private static ThreadLocalSingleton getInstance(){
        return THREAD_LOCAL.get();
    }

}
