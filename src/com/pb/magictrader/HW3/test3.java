package com.pb.magictrader.HW3;

import java.util.Random;

public class test3 {

    /**
     * +1. Ввести элементы массива.
     * -2. Определить "расстояние" (количество элементов) между наибольшим и наименьшим элементами массива.
     * +3. Определить количество отрицательных элементов массива.
     * +4. Вычислить сумму и среднее арифметическое всех положительных элементов массива.
     */
    //Часть 3
    // метод создает массив указанного размера
    // и заполняет его случайными целыми числами
    public static int[] generateArray(int size) {
        Random rnd = new Random();
        int[] array = new int[size];
        for(int i=0; i < size; i++) {
            array[i] = rnd.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        // создадим массив из 5 элементов
        int[] array = generateArray(5);

        // выводим массив в консоль
        for(int i : array) {
            System.out.print(i + " ");
        }

        // считаем элементы
        int negative = 0;
        long sum = 0L;
        int positive = 0;
        for(int i : array) {
            if(i < 0) negative++;
            if(i > 0) {
                positive++;
                try {
                    sum += i;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
        // выведем результат в консоль
        System.out.println("Кол-во отрицательных элементов: " + negative);
        System.out.println("Кол-во положительных элементов: " + positive);
        System.out.println("Сумма положительных элементов: " + sum);
        System.out.println("Cреднее арифметическое положительных элементов: " + sum/positive);
    }

}