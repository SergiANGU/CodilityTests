package org.example.WardrobeKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wardrobe {

    public List<List<Integer>> getWardrobeScenarios(int[] sizes, int totalLength){
        List<Integer> combinations = new ArrayList<>();
        for (int i = 0; i< sizes.length; i++) {
            int actualSize = sizes[i];
            for (int length = 0; length < totalLength + 1; length += actualSize ) {
                combinations.add(actualSize);
            }
        }
        return null;
    }

    public void example(int N, int R){
        List<int[]> combinations = generate(N, R);
        for (int[] combination : combinations) {
            System.out.println(Arrays.toString(combination));
        }
        System.out.printf("generated %d combinations of %d items from %d ", combinations.size(), R, N);
    }

    public List<int[]> generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        helper(combinations, new int[r], 0, n-1, 0);
        return combinations;
    }

    private void helper(List<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }

}
