package com.epam.esm;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isNumeric(str)) {
            BigDecimal number = NumberUtils.createBigDecimal(str);
            return number.compareTo(BigDecimal.ZERO) > 0;
        } else {
            return false;
        }
    }
}
