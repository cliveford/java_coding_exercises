package com.techreturners.exercise004;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Exercise004 {

    final int SECONDSTOADD = 1_000_000_000;
    LocalDateTime plusSeconds;
    public Exercise004(LocalDate date) {
        LocalTime localTime = LocalTime.of(0, 0, 0, 0);
        LocalDateTime localDateTime = LocalDateTime.of(date, localTime);
        plusSeconds = localDateTime.plusSeconds(SECONDSTOADD);
    }

    public Exercise004(LocalDateTime dateTime) {
        plusSeconds = dateTime.plusSeconds(SECONDSTOADD);
    }

    public LocalDateTime getDateTime() {
        return plusSeconds;
    }
}