package org.example.FizzBuzzTestKata;

import org.example.FizzBuzzKata.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void createFizzBuzzClass(){
        new FizzBuzz();
    }

    @Test
    void generate1_100NumbersTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<Integer> numList = fizzBuzz.generate();
        Assertions.assertEquals(numList.size(), fizzBuzz.getNUMBER_OF_ELEMENTS());
    }



    @Test
    void comprovateAllNumbersAreInTheList(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<Integer> numList = fizzBuzz.generate();
        for (int i = 1; i< fizzBuzz.getNUMBER_OF_ELEMENTS() +1; i++){
            int position = i - 1;
            Assertions.assertEquals(numList.get(position), i);
        }
    }

    @ParameterizedTest
    @MethodSource("providedIntsAndTheExpectedResult")
    void shouldPassNonNullMessageAsMethodParameter(int num, String representation) {
        String solution = fizzBuzz.representationNumbers(num);
        assertEquals(solution, representation);
    }

    private static Stream<Arguments> providedIntsAndTheExpectedResult() {
        return Stream.of(
                Arguments.of(6, "Fizz"),
                Arguments.of(5, "Buzz"),
                Arguments.of(15, "FizzBuzz")
        );
    }


}