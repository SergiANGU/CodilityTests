package org.example.ManhattanKata;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PointTest {

    @Test
    public void createPointClass(){
        new Point(3, 5);
    }

    @Test
    public void givedPrefixedTwoPoinsWhenProcesedReturnFour(){
        Point a = new Point(2, 1);
        Point b = new Point(-2,2);

        int result = a.calculateDistanceFromSecondPoint(a,b);
        assertEquals(result, 4);

    }
}
