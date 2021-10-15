package com.pb.VelikoivanenkoT.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //    char num = 'A';
        int operand1;
        int operand2;
//        String symbol;
        System.out.print("Введите первое число: ");
        operand1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        operand2 = scan.nextInt();
//        {
//
//        }
//        symbol = scan.next();
//        {
        System.out.print("Выберите операцию (+ - /*):  ");
        //}
        String sign = scan.next(); // + - / *

        switch (sign) {
            case "+": System.out.println(+(operand1 + operand2));
                break;
            case "-": System.out.println(+(operand1 - operand2));
                break;
            case "*": System.out.println(+(operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) { System.out.println("Ошибка, на 0 делить нельзя!");}
                else System.out.println(+(operand1 / operand2));
                break;
            default: {
                System.out.println("Неверная операция");
            }
        }
    }
}