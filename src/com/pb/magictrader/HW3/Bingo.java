package com.pb.magictrader.HW3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int UnknownNumber, UserNumber, TrysCount = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("GUESS NUMBER FROM 0 TO 100. YOU HAVE MAX 10 STEPS");
        System.out.println("TYPE ext TO STOP");
            UnknownNumber = (int)Math.floor(Math.random() * 100);
            do {
                TrysCount++;
                System.out.print("INPUT NUMBER: ");
                UserNumber = input.nextInt();
                if (UserNumber > UnknownNumber)
                    System.out.println("NUMBER IS LESS.");
                else if (UserNumber < UnknownNumber) System.out.println("NUMBER IS MORE.");	else System.out.println("YOU GUESSED!");
            } while (UserNumber != UnknownNumber);
            System.out.println("TRYSCOUNT: " + TrysCount);
        }
}
