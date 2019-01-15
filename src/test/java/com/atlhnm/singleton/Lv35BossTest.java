package com.atlhnm.singleton;

public class Lv35BossTest implements SimpleSingletonTest, ConcurrentSingletonTest {
    @Override
    public Class<?> singletonClass() {
        return Lv35Boss.class;
    }

    @Override
    public Object getInstance(Class<?> aClass) {
        return Lv35Boss.INSTANCE;
    }
}