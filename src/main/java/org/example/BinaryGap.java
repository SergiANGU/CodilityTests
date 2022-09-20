package org.example;

public class BinaryGap {

    public int solution(int N) {
        String binariNumber = binariConvertor(N);
        int longestBinaryGap = calculateGap(binariNumber);

        return longestBinaryGap;
    }

    public String binariConvertor(int n) {

        return Integer.toBinaryString(n);
    }

    public int calculateGap(String binary){
        String[] parts = binary.split("1");

        if (parts.length < 3){
            return 0;
        }
        int longest = 0;
        for (int i = 0; i < parts.length; i++){
            if (parts[i].length() > longest){
                longest = parts[i].length();
            }
        }
        return longest;
    }

}
