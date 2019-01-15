package com.atlhnm.singleton;

public class Lv15VillainTest implements SimpleSingletonTest, ConcurrentSingletonTest, SerializationSingletonTest {
    @Override
    public Class<?> singletonClass() {
        return Lv15Villain.class;
    }
}