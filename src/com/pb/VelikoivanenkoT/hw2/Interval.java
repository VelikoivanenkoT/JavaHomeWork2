package com.pb.VelikoivanenkoT.hw2;

import java.util.Scanner;

public class Interval {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int x;
            System.out.print("Введите число от 1 до 100 включительно:  ");
            x = scan.nextInt();
            if (x == 1 || x < 101 || x < 1 || x >= 101) {
                if (x >= 1 && x <= 14) {
                    System.out.print("В диапазоне 1-14");
                } else if (x >= 15 && x <= 35) {
                    System.out.print("В диапазоне 15-35");
                } else if (x >= 36 && x <= 51) {
                    System.out.print("В диапазоне 36-51");
                } else if (x >= 52 && x <= 100) {
                    System.out.print("В диапазоне 52-100");
                }
                else if (x < 1 || x >= 101) {
                    System.out.println("Не правильный диапазон, укажите число от 1 до 100");
                }
            }
        }
}
