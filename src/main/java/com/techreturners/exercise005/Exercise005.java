package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        // check if string is empty
        if (input.length() == 0) return false;
        // declare and initialise comparison string
        String compare = "abcdefghijklmnopqrstuvwxyz";
        // declare and initialise lower case input string
        String inputLowerCase = input.toLowerCase();
        // declare and initialise counter to track all letters of alphabet
        int counter = 0;
        // loop through alphabet
        for (int i = 0; i < compare.length(); i++) {
            // loop through input string
            for (int j = 0; j < input.length() ; j++) {
                // check if input string character matches alphabet character
                if (compare.charAt(i) == inputLowerCase.charAt(j)) {
                    // match - increment counter and break out of inner loop
                    counter += 1;
                    break;
                }
            }
        }
        // check if all 26 alphabet characters have been matched
        if (counter == 26) {
            return true;
        } else {
            return false;
        }
    }

}
