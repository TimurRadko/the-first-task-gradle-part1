package com.epam.esm;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!isNumeric(str)) {
            return false;
        }
        BigDecimal number = NumberUtils.createBigDecimal(str);
        return number.compareTo(BigDecimal.ZERO) > 0;
    }
}
