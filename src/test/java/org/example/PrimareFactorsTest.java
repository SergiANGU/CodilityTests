package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimareFactorsTest {

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
    void givedNineWhenProcesedReturnTwoElementArray(){
        PrimareFactors solution = new PrimareFactors();
        int number = 9;
        List<Integer> primareFactors = solution.descompose(number);
        assertEquals(2, primareFactors.size());
    }





}