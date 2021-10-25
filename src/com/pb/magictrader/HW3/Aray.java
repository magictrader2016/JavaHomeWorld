package com.pb.magictrader.HW3;
import java.util.Arrays;
import java.util.Scanner;

public class Aray {
    public static void main(String args[]){
        int counter[];
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("INPUT 10 DIGITS:");
        for (int i=0; i < 10; i++)
        {
            array[i] = scanner.nextInt();
        }
        for( int num : array) {
            sum = sum+num;

        }
        System.out.println("ELEMENTS TOTAL:" + sum);

        for(int i = 0; i < array.length; ++i) {
            sum = sum+array[i];
        }
        System.out.println("POSITIVE TOTAL:" + sum);


        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                    System.out.println("SORT INCREASING ORDER:" + Arrays.toString(array));
                }

            }
        }
    }
}