package com.techreturners.exercise003;

import java.util.Objects;

public class Exercise003 {
    String[] iceCreams = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    int getIceCreamCode(String iceCreamFlavour) {
        for (int i = 0; i < iceCreams.length; i++) {
            if (Objects.equals(iceCreamFlavour, iceCreams[i])) {
                return i;
            }
        }
        throw new UnsupportedOperationException(("Sorry " + iceCreamFlavour + " isn't available"));
    }

    String[] iceCreamFlavours() {
        return iceCreams;
    }

}
