package com.candiolli.challenges;

import java.util.LinkedList;

public class WordMachine {

    public static int solution(String S) {
        LinkedList<Integer> stack = new LinkedList();
        String[] op = S.split(" ");
        for (int i = 0; i < op.length; i++) {
            String operation = op[i];
            try {
                switch (operation) {
                    case "POP":
                        stack.removeLast();
                        break;
                    case "DUP":
                        stack.add(stack.peekLast());
                        break;
                    case "+":
                        sumTopOfMost(stack);
                        break;
                    case "-":
                        subtrackByIndex(stack);
                        break;
                    default:
                        stack.add(Integer.valueOf(op[i]));
                        break;
                }
            } catch (RuntimeException e) {
                return -1;
            }
        }

        return stack.get(stack.size()-1);
    }

    private static void sumTopOfMost(LinkedList<Integer> stack) {
        Integer last = stack.pollLast();
        Integer lastLast = stack.pollLast();
        stack.add(lastLast + last);
    }

    private static void subtrackByIndex(LinkedList<Integer> stack) {
        Integer last = stack.pollLast();
        Integer lastLast = stack.pollLast();
        stack.add(last - lastLast);
    }
}
