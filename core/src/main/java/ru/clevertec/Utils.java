package ru.clevertec;

import ru.clevertec.utils.StringUtils;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str)
                .allMatch(StringUtils::isPositiveNumber);
    }
}