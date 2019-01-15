package com.atlhnm.singleton;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public interface SerializationSingletonTest extends SingletonTest {

    @Test
    default void serializationTest() throws Exception {
        final String tmp = "inst.obj";
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tmp));
            Object instance = getInstance(singletonClass());

            oos.writeObject(instance);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(tmp));
            Object o = ois.readObject();
            ois.close();


            assertEquals(instance, o);
        } finally {
            Files.deleteIfExists(Paths.get(tmp));
        }
    }
}
