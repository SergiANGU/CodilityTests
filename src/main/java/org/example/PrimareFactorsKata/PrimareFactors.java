package org.example.PrimareFactorsKata;

import java.util.ArrayList;
import java.util.List;

public class PrimareFactors {
    public List<Integer> descompose(int number){
        List<Integer> primes = new ArrayList<>();
        for (int divisor = 2; number > 1; ++divisor) {
            System.out.println("Primer Bucle  "+divisor+"   " + number);
            for (; number % divisor == 0; number /= divisor) {
                System.out.println("Segundo Bucle  "+ divisor+"-----" + number);
                primes.add(divisor);
            }
        }
        return primes;
    }

}
