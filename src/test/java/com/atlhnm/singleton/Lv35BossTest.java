package com.atlhnm.singleton;

import java.util.function.Supplier;

public class Lv35BossTest extends AbstractSingletonTest {

    @Override
    public Supplier<Object> getSingletonProvider() {
        return () -> Lv35Boss.INSTANCE;
    }
}