package com.candiolli.challenges;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReturnSmallestPositive {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
    }

    public static int solution(int[] A) {
        int maxValue = Arrays.stream(A).max().getAsInt()+1;
        for (int i = 1; i <= maxValue; i++) {
            Integer val = i;
            IntStream intStream = Arrays.stream(A).sorted().filter(f -> val.equals(f));
            if (intStream.count() == 0) {
                return val;
            }
        }
        return 0;
    }

}
