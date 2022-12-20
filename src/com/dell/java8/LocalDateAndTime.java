package com.dell.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTime {
    public static void main(String[] args) {
        System.out.println("Current Local Date "+LocalDate.now());
        System.out.println("Current Local Time "+ LocalTime.now());
        System.out.println("Current Local Date and Time  "+ LocalDateTime.now());
    }
}
