package com.atlhnm.singleton;

import java.util.function.Supplier;

public class Lv5GangsterTest extends AbstractSingletonTest {

    @Override
    public Supplier<Object> getSingletonProvider() {
        return Lv5Gangster::getInstance;
    }
}