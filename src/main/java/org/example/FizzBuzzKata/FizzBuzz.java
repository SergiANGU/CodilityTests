package org.example.FizzBuzzKata;

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

    public String representationNumbers(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }

        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        return "";
    }


    public int getNUMBER_OF_ELEMENTS() {
        return NUMBER_OF_ELEMENTS;
    }
}
