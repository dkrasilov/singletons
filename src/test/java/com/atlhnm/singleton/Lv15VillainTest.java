package com.atlhnm.singleton;

import java.util.function.Supplier;

public class Lv15VillainTest extends AbstractSingletonTest {

    @Override
    public Supplier<Object> getSingletonProvider() {
        return Lv15Villain::getInstance;
    }
}