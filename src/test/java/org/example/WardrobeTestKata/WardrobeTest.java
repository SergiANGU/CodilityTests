package org.example.WardrobeTestKata;

import org.example.WardrobeKata.Wardrobe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WardrobeTest {


    @Test
    public void checkIfClassExists(){
        new Wardrobe();
    }

    Wardrobe solution = new Wardrobe();

    @Test
    public void givedOneElementArrayWhenProcesedReturnOneCombination(){
        int[] size = {50};
        int totalLength = 250;
        List<Integer> expectedCombinaion = List.of(50,50,50,50,50);
        List<List<Integer>> combinations = solution.getWardrobeScenarios(size, totalLength);
        Assertions.assertEquals(1, combinations.size());
        Assertions.assertEquals(expectedCombinaion, combinations.get(0));
    }

    @Test
    public void testExaple(){
        solution.example(10, 3);
    }

}