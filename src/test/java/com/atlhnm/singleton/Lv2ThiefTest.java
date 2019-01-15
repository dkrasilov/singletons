package com.atlhnm.singleton;

public class Lv2ThiefTest implements SimpleSingletonTest, ConcurrentSingletonTest {

    @Override
    public Class<?> singletonClass() {
        return Lv2Thief.class;
    }
}