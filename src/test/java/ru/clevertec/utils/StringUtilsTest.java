package ru.clevertec.utils;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.JUnitException;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        String value="1";
        assertEquals(StringUtils.isPositiveNumber(value),true);
    }
    @Test
    void isNegativeNumber() {
        String value="-1";
        assertEquals(StringUtils.isPositiveNumber(value),false);
    }
    @Test
    void isNotNumber() {
        String value="a";
        assertEquals(StringUtils.isPositiveNumber(value),false);
    }
}