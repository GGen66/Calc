package com.company;

import java.util.Scanner;
import java.lang.String;


public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double num1, num2;
        String oper;
        System.out.println("введите число");
        num1 = scann.nextDouble();
        System.out.println("введите число");
        num2 = scann.nextDouble();
        System.out.println("введите оператор +,-,/,*");
        oper = scann.next();

        switch (oper) {
            case "+":
                System.out.println( "результат" + (num1 + num2));
                break;

            case "-":

                System.out.println( "результат" + (num1 - num2));
                break;

            case "*":

                System.out.println( "результат" + (num1 * num2));
                break;

            case "/":

                System.out.println( "результат" + (num1 / num2));
                break;
            default:
                System.out.println( "не правильный оператор, заводи шарманку снова");
                break;
        }

    }
}

