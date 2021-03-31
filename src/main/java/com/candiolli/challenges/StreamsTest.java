package com.candiolli.challenges;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {
        var animals = Arrays.asList("tiger", "lion", "monkey", "cat", "elephant");
        Set<String> collect = animals.stream().filter(animal -> animal.length() > 3)
                .sorted()
                .map(animal -> animal + " is a wild animal")
                .collect(Collectors.toSet());

        boolean anyMatch = animals.stream().anyMatch(a -> a.equals("lion"));
        boolean allMatch = animals.stream().allMatch(a -> a.equals("on"));

        System.out.println(collect);
        System.out.println(anyMatch);
        System.out.println(allMatch);
    }
}
