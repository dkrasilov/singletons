package com.atlhnm.singleton;

public class Lv2Thief {
    private static Lv2Thief INSTANCE = null;

    private Lv2Thief() {
        if (INSTANCE != null)
            throw new IllegalStateException("Am i joke for you?");
    }

    public static Lv2Thief getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Lv2Thief();
        }
        return INSTANCE;
    }

}
