package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimareFactorsTest {
    PrimareFactors solution = new PrimareFactors();

    @Test
    void TestingIfClassExsist(){
        new PrimareFactors();
    }

    @Test
    void givedOneWhenProcesedReturnEmptyArray(){
        PrimareFactors solution = new PrimareFactors();
        int numberOne = 1;
        List<Integer> primareFactors = solution.descompose(numberOne);
        assertEquals(0, primareFactors.size());
    }

    @Test
    void givedTwoWhenProcesedReturnOneElementArry(){
        PrimareFactors solution = new PrimareFactors();
        int number = 2;
        List<Integer> primareFactors = solution.descompose(number);
        assertEquals(1, primareFactors.size());
    }

    @Test
    void gived18WhenProcesedReturnThreeElementArray(){
        PrimareFactors solution = new PrimareFactors();
        int number = 18;
        List<Integer> primareFactors = solution.descompose(number);
        assertEquals(3, primareFactors.size());
    }

    @ParameterizedTest
    @MethodSource("providedIntsAndTheExpectedResult")
    void shouldPassNonNullMessageAsMethodParameter(int number, List<Integer> expected) {
        List<Integer> primareFactors = solution.descompose(number);
        assertEquals(expected, primareFactors);
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