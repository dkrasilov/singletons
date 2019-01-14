package com.atlhnm.singleton;

public class Lv1Crook {
    private static final Lv1Crook INSTANCE = new Lv1Crook();

    private Lv1Crook() {
        if (INSTANCE != null)
            throw new IllegalStateException("Am i joke for you?");
    }

    public static Lv1Crook getInstance() {
        return INSTANCE;
    }
}
