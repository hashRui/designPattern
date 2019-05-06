package Singleton;

/**
 * Created by 胡锐 on 2019/5/6.
 */

/**
 * 从 JDK 层面就为枚举不被序列化和反射来保驾护航
 * 枚举
 * 1、能够避免反序列化带来的影响
 *     反序列化在 ObjectInputStream 的 readObject 方法 会掉一个 readObject0
 *     里面会判断 当前类若是枚举类的时候 会
 *      case TC_ENUM:
        return checkResolve(readEnum(unshared));
        Enum<?> en = Enum.valueOf((Class)cl, name);
        (Class)cl, name)  表示 枚举类的类名 和 枚举的字段名来表示唯一，
        所以只会创建一个枚举类对象

 2、能够避免反射的暴力破解
        反射通过 类.newInstance 方法创建对象时，
        Coustructor 类中 会判断 这个类是不是枚举 如果是枚举就不让反射去创建
       if ((clazz.getModifiers() & Modifier.ENUM) != 0)
 throw new IllegalArgumentException("Cannot reflectively create enum objects");


 *
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
