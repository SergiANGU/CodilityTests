package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private final int NUMBER_OF_ELEMENTS = 100;

    public List<Integer> generate(){
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i < NUMBER_OF_ELEMENTS + 1; i++){
            numberList.add(i);
        }
        return numberList;
    }

    public int getNUMBER_OF_ELEMENTS() {
        return NUMBER_OF_ELEMENTS;
    }
}
