package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input.length() == 0) return false;
        String compare = "abcdefghijklmnopqrstuvwxyz";
        String inputLowerCase = input.toLowerCase();
        int counter = 0;
        for (int compareIndex = 0; compareIndex < compare.length(); compareIndex++) {
            for (int inputIndex = 0; inputIndex < input.length() ; inputIndex++) {
                if (compare.charAt(compareIndex) == inputLowerCase.charAt(inputIndex)) {
                    counter++;
                    break;
                }
            }
        }
        return counter == 26;
    }

}
