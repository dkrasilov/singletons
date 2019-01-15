package com.atlhnm.singleton;

public class Lv7NegroTest implements SimpleSingletonTest, ConcurrentSingletonTest {
    @Override
    public Class<?> singletonClass() {
        return Lv7Negro.class;
    }
}