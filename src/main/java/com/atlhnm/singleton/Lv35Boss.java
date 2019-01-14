package com.atlhnm.singleton;

public enum Lv35Boss {
    INSTANCE;

    static {
        System.out.printf("Initialization of %s\n", Lv35Boss.class.getName());
    }

    @Override
    public String toString() {
        return "That's me, Singleton";
    }
}
