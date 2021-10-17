package com.pb.magictrader.HW2;

import java.util.Scanner;

import static java.lang.System.in;

public class Calculator0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        String sign; // = "/"; // + - * /
        int operand1;
        int operand2;

        System.out.println("ENTER DIGIT A:");

        operand1 = scan.nextInt();

        System.out.println("ENTER DIGIT B:");

        operand2 = scan.nextInt();

        System.out.println("ENTER OPERATION +-*/:");

        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0)
                    System.out.println("ILLEGAL DIVISION BY ZERO");
                if (operand2 != 0)
                    System.out.println(operand1 + " / " + operand2 + " + " + (operand1 / operand2));
                break;
            default:
                System.out.println("WRONG INPUT");
        }
    }
}