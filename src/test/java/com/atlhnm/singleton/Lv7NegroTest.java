package com.atlhnm.singleton;

import java.util.function.Supplier;

public class Lv7NegroTest extends AbstractSingletonTest {

    @Override
    public Supplier<Object> getSingletonProvider() {
        return Lv7Negro::getInstance;
    }
}