package com.atlhnm.singleton;

import java.io.Serializable;

public class Lv15Villain implements Serializable {
    private static final long serialVersionUID = 1L;

    private static class Lv15VillainLoader {
        private static final Lv15Villain INSTANCE = new Lv15Villain();
    }

    private Lv15Villain() {
    }

    public static Lv15Villain getInstance() {
        return Lv15VillainLoader.INSTANCE;
    }

    // Damn you serialization
    @SuppressWarnings("unused")
    private Lv15Villain readResolve() {
        return Lv15VillainLoader.INSTANCE;
    }
}
