package com.atlhnm.singleton;

public class Lv7Negro {
    private static volatile Lv7Negro INSTANCE = null;

    private Lv7Negro() {
        if (INSTANCE != null)
            throw new IllegalStateException("Am i joke for you?");
    }

    public static Lv7Negro getInstance() {
        //todo add test for it  http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
        if (INSTANCE == null) {
            synchronized (Lv7Negro.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Lv7Negro();
                }
            }
        }
        return INSTANCE;
    }

}
