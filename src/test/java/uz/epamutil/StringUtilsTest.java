package uz.epamutil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    @Test
    public void isPositiveNumber() {
        String str1 = "-1614";
        boolean isPositive1 = StringUtils.isPositiveNumber(str1);
        assertFalse(isPositive1, "It should be a non-positive number");

        String str2 = "16145";
        boolean isPositive2 = StringUtils.isPositiveNumber(str2);
        assertTrue(isPositive2, "It should be a positive number");
    }
}