package com.atlhnm.singleton;

public enum Perfect {
    INSTANCE;

    static {
        System.out.printf("Initialization of %s\n", Perfect.class.getName());
    }

    @Override
    public String toString() {
        return "That's me, Singleton";
    }
}
