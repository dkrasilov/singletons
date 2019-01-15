package com.atlhnm.singleton;

public class Lv5GangsterTest implements SimpleSingletonTest, ConcurrentSingletonTest {
    @Override
    public Class<?> singletonClass() {
        return Lv5Gangster.class;
    }
}