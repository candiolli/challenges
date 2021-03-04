package com.candiolli.challenges;

public class BalancedBracketsAlgorithm {

    static boolean isBracketsBalanced(String str) {
//        JAVA 11
//        Deque<Character> stack = new ArrayDeque<>();
//
//
//        for (int i = 0; i < expr.length(); i++) {
//            char x = expr.charAt(i);
//
//            if (x == '(' || x == '[' || x == '{') {
//                stack.push(x);
//                continue;
//            }
//
//            if (stack.isEmpty())
//                return false;
//            char check;
//            switch (x) {
//                case ')':
//                    check = stack.pop();
//                    if (check == '{' || check == '[')
//                        return false;
//                    break;
//
//                case '}':
//                    check = stack.pop();
//                    if (check == '(' || check == '[')
//                        return false;
//                    break;
//
//                case ']':
//                    check = stack.pop();
//                    if (check == '(' || check == '{')
//                        return false;
//                    break;
//            }
//        }
//
//        return stack.isEmpty();

//        JAVA 8

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return str.length() == 0;
    }

    public static void main(String[] args) {
        String expr = "([{})]";

        if (isBracketsBalanced(expr)) {
            System.out.println("Balanced ");
        } else {
            System.out.println("Not Balanced ");
        }
    }

}
