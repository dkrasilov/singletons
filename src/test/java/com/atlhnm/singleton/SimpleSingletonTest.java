package com.atlhnm.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public interface SimpleSingletonTest extends SingletonTest {
    @Test
    default void simpleTest() throws Exception {
        Object instance = getInstance(singletonClass());
        assertEquals(instance, getInstance(singletonClass()));
    }
}
