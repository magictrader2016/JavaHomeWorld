package com.pb.magictrader.HW4;
import java.util.Scanner;

public class Capital1 {
    private static Scanner sc;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER PHRASE: ");
        String first = in.nextLine().toUpperCase();
        String[] tests = {"XXXX"};

        for (String s : tests) {
            System.out.println(toUp(s));
        }
    }

    static String toUp(String s){
        char[] arr = s.toCharArray();
        boolean inWord = false;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                if (inWord) {
                    continue;
                }
                arr[i] -= 32;
                inWord = true;
            } else {
                inWord = false;
            }
        }
        return new String(arr);
    }
}