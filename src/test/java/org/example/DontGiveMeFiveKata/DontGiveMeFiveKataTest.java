package org.example.DontGiveMeFiveKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DontGiveMeFiveKataTest {

    private DontGiveMeFiveKata solution = new DontGiveMeFiveKata();

    @Test
    public void givedTwoNumberWhenProcesedReturnTheDiference(){
        int num1 = 2, num2 =12;
        List<Integer> result = solution.substract(num1,num2);
        Assertions.assertEquals(result.size(), 11);
    }

    @Test
    public void givedAListOfNumbersReturnTheListExceptNumberFive(){
        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10,50,155,550,555,501,5000,55555,5050,351);
        List<Integer> expectedList = List.of(1,2,3,4,6,7,8,9,10);
        List<Integer> no5List = solution.fiveSubstractor(numberList);
        Assertions.assertEquals(expectedList, no5List);
    }


}