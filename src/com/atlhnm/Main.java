package com.atlhnm;

import com.atlhnm.singleton.Perfect;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Something that done before");

        System.out.println(Perfect.INSTANCE);

        System.out.println("After creation");
    }
}
