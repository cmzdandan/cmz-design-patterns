package com.cmz.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @nickname 陈梦洲
 * @date 2019/3/17 0017
 * @description 序列化与反序列化单例
 */
public class SerializableSingleton implements Serializable {
    /** 私有化类构造器 */
    private SerializableSingleton() {}

    /** 定义静态私有类对象 */
    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    /** 提供公共静态的获取该私有类对象的方法 */
    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    /** 重写readResolve()方法，保证反序列化生成对象时获得的是同一个对象 */
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
