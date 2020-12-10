package com.candiolli.challenges;

import java.util.Scanner;

public class ScannerApp {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String myString = scanner.next();
//            scanner.next
//            System.out.println("myString is: " + myString);
//        }
//        scanner.close();
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        String d = scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + Double.parseDouble(d));
        System.out.println("Int: " + i);
    }

}
