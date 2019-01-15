package com.atlhnm.singleton;

class Lv10HitmanTest implements SimpleSingletonTest, ConcurrentSingletonTest, SerializationSingletonTest {
    @Override
    public Class<?> singletonClass() {
        return Lv10Hitman.class;
    }
}