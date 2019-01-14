package com.atlhnm.singleton;

import java.util.function.Supplier;

public class Lv2ThiefTest extends AbstractSingletonTest {

    @Override
    public Supplier<Object> getSingletonProvider() {
        return Lv2Thief::getInstance;
    }
}