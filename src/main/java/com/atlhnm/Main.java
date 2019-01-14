package com.atlhnm;

import com.atlhnm.singleton.Lv35Boss;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Something that done before");

        System.out.println(Lv35Boss.INSTANCE);

        System.out.println("After creation");
    }
}
