package com.candiolli.complexity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Examples {

    List<String> listOf = new ArrayList<>();
    List<Integer> listOfValues = List.of(90, 10, 20, 30, 45, 50, 60, 70, 80);

    public static void main(String[] args) {
        new Examples().findTheValueTest();
    }

    // O(1)
    // Constant time
    // It is the algorithm wount varity based on the input parameters
    public String getValueByIndex(int index) {
        return listOf.get(index);
    }

    public void findTheValueTest() {
        findTheValue(listOfValues, 80);
    }

    // O(log n)
    public Integer findTheValue(List<Integer> listOfValues, Integer value) {
        List<Integer> sortedList = listOfValues.stream().sorted().toList();

        Integer index = sortedList.size() / 2;
        Integer i = sortedList.get(index);

        if (value.equals(i)) return index;
        else if (value > i) {

            List<Integer> copyOfArray = new ArrayList<>();
            for (int e = 0; e <= index; e++) {
                copyOfArray.add(sortedList.get(e));
            }

            return findTheValue(sortedList, value);
        }

        return null;
    }
}
