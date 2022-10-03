package org.example.PrimareFactorsTestKata;

import org.example.PrimareFactorsKata.PrimareFactors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimareFactorsTest {
    PrimareFactors solution = new PrimareFactors();

    @ParameterizedTest
    @MethodSource("providedIntsAndTheExpectedResult")
    void shouldPassNonNullMessageAsMethodParameter(int number, List<Integer> expected) {
        List<Integer> primareFactors = solution.descompose(number);
        assertEquals(expected, primareFactors);
    }

    @Test
    void TestingTheDivisorAndNumberParameters(){
        solution.descompose(11);
    }


    private static Stream<Arguments> providedIntsAndTheExpectedResult() {
        return Stream.of(
                    Arguments.of(1, List.of()),
                Arguments.of(2, List.of(2)),
                Arguments.of(3, List.of(3)),
                Arguments.of(4, List.of(2,2)),
                Arguments.of(6, List.of(2,3)),
                Arguments.of(8, List.of(2,2,2)),
                Arguments.of(9, List.of(3,3))
        );
    }


}