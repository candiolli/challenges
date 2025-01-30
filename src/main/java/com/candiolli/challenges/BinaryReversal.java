package com.candiolli.challenges;

import java.util.Scanner;

/**
 * Binary Reversal
 * Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer,
 * take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits, and then
 * finally return the new reversed string in decimal form. For example: if str is "47" then the binary version
 * of this integer is 101111 but we pad it to be 00101111. Your program should reverse this binary string which
 * then becomes: 11110100 and then finally return the decimal version of this string, which is 244.
 * Examples
 * Input: "213"
 * Output: 171
 * Input: "4567"
 * Output: 60296
 * Tags
 * string manipulationfree
 */
public class BinaryReversal {

    public static int binaryReversal(String str) {

        int val = Integer.parseInt(str);
        System.out.println(val);
        String binaryStr = Integer.toBinaryString(val);
        String binaryStrPad = padLeftZeros(binaryStr, 8);
        System.out.println(binaryStrPad);
        StringBuilder binary = new StringBuilder(binaryStrPad);
        System.out.println(binary);
        String binaryReverse = binary.reverse().toString();
        System.out.println(binaryReverse);

        return Integer.parseInt(binaryReverse, 2);
    }

    private static String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }
//
//    public static int convertStringToDecimal(String binary) {
//        int decimal=0;
//        int power=0;
//        while(binary.length()>0)
//        {
//            int temp = Integer.parseInt(binary.charAt((binary.length())-1)+"");
//            decimal+=temp*Math.pow(2, power++);
//            binary=binary.substring(0,binary.length()-1);
//        }
//        return decimal;
//    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(BinaryReversal2(s.nextLine()));
    }

    public static int BinaryReversal(String str) {
        String reversedBinaryNum = new StringBuilder(Integer.toBinaryString(Integer.parseInt(str))).reverse().toString();
        reversedBinaryNum += (reversedBinaryNum.length() % 8 > 0 ? "0000000".substring(0, 8 - reversedBinaryNum.length() % 8) : "");
        return Integer.parseInt(reversedBinaryNum, 2);
    }

    public static String reverseString(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            newString += s.charAt(s.length() - i - 1);
        }
        return newString;
    }


    public static String BinaryReversal2(String str) {
        System.out.println(str);
        String binaryStr = Integer.toBinaryString(Integer.parseInt(str));
        System.out.println(binaryStr);
        int strLength = 8 * ((binaryStr.length() + 7) / 8);
        String paddedZeroes = "";

        for (int i = 0; i < strLength; i++) {
            paddedZeroes += "0";
        }

        System.out.println(strLength);
        String paddedStr = paddedZeroes + binaryStr;
        String eightbitString = paddedStr.substring(paddedStr.length() - strLength);
        System.out.println(eightbitString);
        String reversedBinary = reverseString(eightbitString);
        System.out.println(reversedBinary);
        int reversedDecimal = Integer.parseUnsignedInt(reversedBinary, 2);
        System.out.println(reversedDecimal);
        return Integer.toString(reversedDecimal);
    }

}
