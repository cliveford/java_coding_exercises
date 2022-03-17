package com.techreturners.exercise004;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise004 {
    // declare exercise variables
    LocalTime localTime;
    LocalDateTime localDateTime;
    LocalDateTime plusSeconds;
    public Exercise004(LocalDate date) {
        // instantiate localTime with 00,00,00,00 to use when only date has been specified
        localTime = LocalTime.of(00, 00, 00, 00);
        localDateTime = LocalDateTime.of(date, localTime);
        // instantiate plusSeconds with localDateTime plus 1 giga-second
        plusSeconds = localDateTime.plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        // instantiate plusSeconds with dateTime plus 1 giga-second
        plusSeconds = dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return plusSeconds;
    }
}