package org.example.DontGiveMeFiveKata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DontGiveMeFiveKata {

    public int inicia(){
        List<Integer> numbers = substract(2,60);
        List<Integer> numbersNo5 = fiveSubstractor(numbers);
        return numbersNo5.size();
    }

    public List<Integer> substract(int num1, int num2){
        List<Integer> substractedNumbers = new ArrayList<>();
        for (;num1<=num2;num1++){
            substractedNumbers.add(num1);

        }
        return substractedNumbers;
    }

    public List<Integer> fiveSubstractor(List<Integer> numberList){
        return numberList.stream()
                .map(numero ->numero.toString())
                .filter(textNumber -> textNumber.indexOf("5")<0)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }


}
