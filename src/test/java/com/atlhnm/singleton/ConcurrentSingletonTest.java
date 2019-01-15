package com.atlhnm.singleton;


import com.atlhnm.singleton.util.TestClassLoader;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.assertEquals;

public interface ConcurrentSingletonTest extends SingletonTest {

    @Test
    default void multiThreadTest() throws Exception {
        TestClassLoader classLoader = new TestClassLoader(ClassLoader.getSystemClassLoader());
        Class<?> aClass = classLoader.loadClass(singletonClass().getName());

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Object> firstInstance = executorService.submit(() -> getInstance(aClass));
        Future<Object> secondInstance = executorService.submit(() -> getInstance(aClass));
        assertEquals(firstInstance.get(), secondInstance.get());
    }
}
