package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {
    String[] iceCreams = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    int getIceCreamCode(String iceCreamFlavour) {
        return Arrays.asList(iceCreams).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return iceCreams;
    }

}
