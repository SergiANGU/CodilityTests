package org.example;

public class BinaryGap {

    public int solution(int N) {
        String binariNumber = binariConvertor(N);
        int longestBinaryGap = calculateGap2(binariNumber);

        return longestBinaryGap;
    }

    public String binariConvertor(int n) {

        return Integer.toBinaryString(n);
    }

    public int calculateGap(String binary){
        String[] parts = binary.split("");

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

    public int calculateGap2(String binary){
        int count = 0;
        int longest = 0;
        int iCounter = 0;
        for (int i = 0; i < binary.length(); i++){
            if (binary.toCharArray()[i] == '1') {
                iCounter++;
            }
            if (binary.toCharArray()[i] == '0' && iCounter != 2){
                count++;
            }else{
                longest = count;
                count = 0;
            }
        }
        return longest;
    }

}
