package com.candiolli.patterns.strategy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String hefg = nextPermutation("ab");

        System.out.println(hefg);
    }

    public static String nextPermutation(String word) {
        // Convert string to char array for easier manipulation
        char[] chars = word.toCharArray();

        // Find the first character from right that is smaller than its next character
        int i = chars.length - 2;
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }

        // If no such character exists, return null or original string
        if (i < 0) {
            return "no answer";
        }

        // Find the smallest character on right side of chars[i] that is greater than chars[i]
        int j = chars.length - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }

        // Swap the characters at i and j
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        // Reverse the substring after position i to get the smallest permutation
        reverse(chars, i + 1, chars.length - 1);

        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static String biggerIsGreater(String w) {
        // Write your code here

        char[] array = w.toCharArray();

        char[] arrayOrdered = w.toCharArray();

        Arrays.sort(arrayOrdered);

        boolean isArraysEquals = isArraysEquals(array, arrayOrdered);

        if (isArraysEquals) return "no answer";

        StringBuilder sb = new StringBuilder();
        for (char c : arrayOrdered) {
            sb.append(c);
        }

        return sb.toString();
        // List<String> arrayOrdered = Stream.of(w.toCharArray())
        //                         .map(c -> String.valueOf(c))
        //                         .sorted()
        //                         .collect(toList());

        // String[] arrayOrdered = w.split("");


        // return w;
    }

    private static boolean isArraysEquals(char[] array1, char[] array2) {
        for (char c1 : array1) {
            for (char c2 : array2) {
                if (c1 != c2) return false;
            }
        }
        return true;
    }

//    class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int T = Integer.parseInt(bufferedReader.readLine().trim());
//
//            IntStream.range(0, T).forEach(TItr -> {
//                try {
//                    String w = bufferedReader.readLine();
//
//                    String result = Result.biggerIsGreater(w);
//
//                    bufferedWriter.write(result);
//                    bufferedWriter.newLine();
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            });
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }
}
