package com.atlhnm.singleton;

import java.util.function.Supplier;

public class Lv1CrookTest extends AbstractSingletonTest {

    @Override
    public Supplier<Object> getSingletonProvider() {
        return Lv1Crook::getInstance;
    }
}