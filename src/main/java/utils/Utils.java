package utils;

import lombok.SneakyThrows;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static final String currentDay = LocalDate.now().format(DateTimeFormatter.ofPattern("dd"));
    public static final String currentMonth = LocalDate.now().format(DateTimeFormatter.ofPattern("MM"));
    public static final String currentYear = String.valueOf(LocalDate.now().getYear());

    public static String getLocalDateTime() {
        final LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");

        return dateTime.format(formatter);
    }

    @SneakyThrows
    public static String formatTodayToUS() {
        final LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return dateTime.format(formatter);
    }
}
