package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimareFactors {
    public List<Integer> descompose(int number){
        List<Integer> primes = new ArrayList<>();
        for (int divisor = 2; number > 1; ++divisor) {
            for (; number % divisor == 0; number /= divisor) {
                primes.add(divisor);
            }
        }
        return primes;
    }

}
