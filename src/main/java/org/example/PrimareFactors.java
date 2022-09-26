package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimareFactors {

    public List<Integer> descompose(int number){

        List<Integer> primes = new ArrayList<>();

        for (int candidate = 2; number > 1; ++candidate) {
            for (; number % candidate == 0; number /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }
}
