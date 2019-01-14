package com.atlhnm.singleton;

public class Lv10Hitman {
    private static class Lv10HitmanLoader {
        private static final Lv10Hitman INSTANCE = new Lv10Hitman();
    }

    private Lv10Hitman() {
    }

    public static Lv10Hitman getInstance() {
        return Lv10Hitman.Lv10HitmanLoader.INSTANCE;
    }
}
