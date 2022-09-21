package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    BinaryGap solution = new BinaryGap();

    @Test
    void givedNumberWhenProcesedReturnTheBinari(){

        int number = 9;
        String binari = solution.binariConvertor(number);
        Assertions.assertEquals("1001", binari);

    }

    @Test
    void givedBinaryStringWhenProcesedeturnTheLongestGap(){

        String binari = "1001";
        int binaryGap = solution.calculateGap(binari);
        Assertions.assertEquals(2, binaryGap);

    }

    @Test
    void globalTest(){
        int number = 328;
        int result = solution.solution(number);
        Assertions.assertEquals(2, result);
    }
    @Test
    void gived

}