package com.candiolli.challenges;

import java.util.ArrayList;
import java.util.List;

public class WordMachine {

    public static void main(String[] args) {
//        System.out.println(solution("4 5 6 - 7 +"));
//        System.out.println(solution("13 DUP 4 POP 5 DUP + DUP + -"));
        System.out.println(solution("5 6 + -"));
    }

    public static int solution(String S) {
        List<Integer> stack = new ArrayList();
        String[] op = S.split(" ");
        for (int i = 0; i < op.length; i++) {
            String operation = op[i];
            try {
                switch (operation) {
                    case "POP":
                        removeTopmost(stack);
                        break;
                    case "DUP":
                        duplicateTopmost(stack);
                        break;
                    case "+":
                        sumTopmost(stack);
                        break;
                    case "-":
                        subtrackByIndex(stack);
                        break;
                    default:
                        stack.add(Integer.valueOf(op[i])); //PUSH
                        break;
                }
            } catch (RuntimeException e) {
                return -1;
            }
        }

        return stack.get(stack.size()-1);
    }

    private static void sumTopmost(List<Integer> stack) {
        Integer last = stack.get(stack.size() - 1);
        Integer lastLast = stack.get(stack.size() - 2);
        stack.remove(stack.size() - 1);
        stack.remove(stack.size() - 1);
        stack.add(lastLast + last);
    }

    private static void duplicateTopmost(List<Integer> stack) {
        Integer last = stack.get(stack.size() - 1);
        stack.add(last);
    }

    private static void removeTopmost(List<Integer> stack) {
        Integer last = stack.get(stack.size() - 1);
        stack.remove(last);
    }

    private static void subtrackByIndex(List<Integer> stack) {
        Integer last = stack.get(stack.size() - 1);
        Integer lastLast = stack.get(stack.size() - 2);
        stack.remove(stack.size() - 1);
        stack.remove(stack.size() - 1);
        stack.add(last - lastLast);
    }
}
