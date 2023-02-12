package ru.clevertec.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str){
        int i =org.apache.commons.lang3.StringUtils.isNumeric(str)?Integer.parseInt(str) : -1;
        return i>=0;
    }
}
