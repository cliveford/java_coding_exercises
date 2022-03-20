package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        char first = firstName.charAt(0);
        char second = lastName.charAt(0);
        return first + "." + second;
    }

    public double addVat(double originalPrice, double vatRate) {
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double vat = originalPrice * vatRate / 100;
        double vatAdded = originalPrice + vat;
        return Double.parseDouble(decimalFormat.format(vatAdded));
    }

    public String reverse(String sentence) {
        StringBuilder stringBuilder = new StringBuilder(sentence);
        return String.valueOf(stringBuilder.reverse());
    }

    public int countLinuxUsers(List<User> users) {
        int linuxUsers = 0;
        for (User user : users) {
            String opSystem = user.getType();
            if(opSystem.equals("Linux")) linuxUsers += 1;
        }
        return linuxUsers;
    }
}
