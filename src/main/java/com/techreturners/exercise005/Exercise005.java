package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input.length() == 0) return false;
        String compare = "abcdefghijklmnopqrstuvwxyz";
        String inputLowerCase = input.toLowerCase();
        int counter = 0;
        for (int i = 0; i < compare.length(); i++) {
            for (int j = 0; j < input.length() ; j++) {
                if (compare.charAt(i) == inputLowerCase.charAt(j)) {
                    counter += 1;
                    break;
                }
            }
        }
        if (counter == 26) {
            return true;
        } else {
            return false;
        }
    }

}
