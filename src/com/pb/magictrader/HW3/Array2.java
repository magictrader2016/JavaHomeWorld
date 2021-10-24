package com.pb.magictrader.HW3;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        int counter, num, array[];

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ARRAY ELEMENTS QUANTITY:");
        num = input.nextInt();


        array = new int[num];

        System.out.println("INPUT 10 DIGITS:");

        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }

        bubbleSort(array);

        System.out.println("SORT INCREASING ORDER:" + Arrays.toString(array));
    }

    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j > num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}