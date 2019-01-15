package com.atlhnm.singleton;

public class Lv15VillainTest implements SimpleSingletonTest, ConcurrentSingletonTest {
    @Override
    public Class<?> singletonClass() {
        return Lv15Villain.class;
    }
}