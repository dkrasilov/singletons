package com.atlhnm.singleton;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Supplier;

import static junit.framework.TestCase.assertEquals;

public abstract class AbstractSingletonTest {
    private Supplier<Object> singletonProvider;

    public abstract Supplier<Object> getSingletonProvider();

    @Before
    public void setUp() throws Exception {
        singletonProvider = getSingletonProvider();
    }

    @Test
    public void simpleTest() {
        Object instance = singletonProvider.get();
        assertEquals(instance, singletonProvider.get());
    }
}
