package com.atlhnm.singleton.util;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class TestClassLoader extends ClassLoader {
    public TestClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (name.startsWith("java"))
            return super.loadClass(name);
        try {
            String fileName = name.replace(".", File.separator) + ".class";

            InputStream is = Objects.requireNonNull(getResourceAsStream(fileName));
            DataInputStream classStream = new DataInputStream(is);

            byte[] bytes = new byte[classStream.available()];
            classStream.readFully(bytes);

            Class<?> definedClass = defineClass(name, bytes, 0, bytes.length);
            resolveClass(definedClass);
            return definedClass;
        } catch (IOException e) {
            throw new ClassNotFoundException("Seems like our custom classloader is not working", e);
        }
    }
}
