package com.atlhnm.singleton;

public interface SingletonTest {
    Class<?> singletonClass();

    default Object getInstance(Class<?> aClass) throws Exception {
        return aClass.getMethod("getInstance").invoke(null);
    }
}
