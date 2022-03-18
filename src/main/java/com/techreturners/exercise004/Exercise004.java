package com.techreturners.exercise004;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise004 {

    LocalDateTime plusSeconds;
    public Exercise004(LocalDate date) {
        LocalTime localTime = LocalTime.of(00, 00, 00, 00);
        LocalDateTime localDateTime = LocalDateTime.of(date, localTime);
        plusSeconds = localDateTime.plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        plusSeconds = dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return plusSeconds;
    }
}