package com.epam.esm;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("15", true),
                Arguments.of("", false),
                Arguments.of("-15", false),
                Arguments.of("not number", false),
                Arguments.of("0", false),
                Arguments.of("-100000", false),
                Arguments.of("1000000000000000", true),
                Arguments.of("10.00000000000000", true),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideStrings")
    void testIsPositiveNumber(String str, boolean expected) {
        assertEquals(expected, StringUtils.isPositiveNumber(str));
    }
}
