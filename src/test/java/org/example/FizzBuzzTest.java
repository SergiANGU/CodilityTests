package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

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
    void comprovateIfNumberOneIsInTheList(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<Integer> numList = fizzBuzz.generate();
        Assertions.assertEquals(numList.get(0), 1);
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

    @Test
    void comprovateNumber3TellFizz(){
        Assertions.assertEquals("Fizz", 3);
    }


}