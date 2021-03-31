package com.candiolli.challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class OptimazingBoxWeightsWithStream {

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        AtomicReference<Integer> sumT = new AtomicReference<>(sumArray(arr));
        AtomicReference<Integer> sumA = new AtomicReference<>(0);
        List arrayA = new ArrayList();
        arr.stream().sorted(Comparator.reverseOrder())
                .forEach(i -> {
                    if (sumA.get() >= sumT.get()) {
                        return;
                    } else {
                        Integer remove = arr.remove(0);
                        arrayA.add(i);
                        sumT.updateAndGet(v -> v - remove);
                        sumA.updateAndGet(v -> v + i);
                    }
                });

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
        arr.add(5);        arr.add(3);         arr.add(2);
        arr.add(4);        arr.add(1);         arr.add(2);
        List<Integer> integers = minimalHeaviestSetA(arr);
        System.out.println(integers);
    }
}
