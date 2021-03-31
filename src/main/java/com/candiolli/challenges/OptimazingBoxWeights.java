package com.candiolli.challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OptimazingBoxWeights {

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        Integer sumT = sumArray(arr);
        Integer sumA = 0;
        List arrayA = new ArrayList();

        arr.sort(Comparator.reverseOrder());

        for (Integer i : arr) {
            if (sumA >= sumT) {
                break;
            } else {
                arrayA.add(i);
                sumA += i;
            }
        };

        return arrayA;
    }

    private static Integer sumArray(List<Integer> arr) {
        Integer sumT = 0;
        for (Integer i : arr) {
            sumT += i;
        }
        return sumT;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        List<Integer> integers = minimalHeaviestSetA(arr);
        System.out.println("Main: " + integers);
    }
}
