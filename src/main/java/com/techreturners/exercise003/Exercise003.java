package com.techreturners.exercise003;

import java.util.Objects;

public class Exercise003 {
    String[] iceCreams = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    int getIceCreamCode(String iceCreamFlavour) {
        int iceCreamCode = 0;
        for (int i = 0; i < iceCreams.length; i++) {
            if (Objects.equals(iceCreamFlavour, iceCreams[i])) {
                iceCreamCode = i;
                break;
            }
        }
        return iceCreamCode;
    }

    String[] iceCreamFlavours() {
        return iceCreams;
    }

}
