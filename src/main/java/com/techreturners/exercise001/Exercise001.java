package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        return capitalized;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        char first = firstName.charAt(0);
        char second = lastName.charAt(0);
        String initials = first + "." + second;
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double vat = originalPrice * vatRate / 100;
        double vatAdded = originalPrice + vat;
        double total = Double.parseDouble(decimalFormat.format(vatAdded));
        return total;
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuilder stringBuilder = new StringBuilder(sentence);
        String reversedString = String.valueOf(stringBuilder.reverse());
        return reversedString;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int linuxUsers = 0;
        for (User user : users) {
            String opSystem = user.getType();
            if(opSystem.equals("Linux")) linuxUsers += 1;
        }
        return linuxUsers;
    }
}
