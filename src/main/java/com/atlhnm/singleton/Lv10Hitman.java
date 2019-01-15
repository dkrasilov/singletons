package com.atlhnm.singleton;

import java.io.Serializable;

public class Lv10Hitman implements Serializable {
    private static final long serialVersionUID = 1L;

    private Lv10Hitman() {
    }

    public static Lv10Hitman getInstance() {
        return Lv10Hitman.Lv10HitmanLoader.INSTANCE;
    }

    private static class Lv10HitmanLoader {
        private static final Lv10Hitman INSTANCE = new Lv10Hitman();
    }
}
