package com.atlhnm.singleton;

public class Lv5Gangster {
    private static Lv5Gangster INSTANCE = null;

    private Lv5Gangster() {
        if (INSTANCE != null)
            throw new IllegalStateException("Am i joke for you?");
    }

    public static Lv5Gangster getInstance() {
        synchronized (Lv5Gangster.class) {
            if (INSTANCE == null) {
                INSTANCE = new Lv5Gangster();
            }
        }
        return INSTANCE;
    }

}
