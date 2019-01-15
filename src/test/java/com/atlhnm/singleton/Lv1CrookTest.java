package com.atlhnm.singleton;

public class Lv1CrookTest implements SimpleSingletonTest, ConcurrentSingletonTest {
    @Override
    public Class<?> singletonClass() {
        return Lv1Crook.class;
    }
}