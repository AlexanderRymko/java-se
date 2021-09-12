package by.rymko.home;

// Високосный год

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        System.out.println("Ввелите номер года");
        int a = year.nextInt();
        if ((a % 4 == 0 ^ a % 100 == 0) | a % 400 == 0) {
            System.out.println("Введенной год является високосным. ");
        } else {
            System.out.println("Введенный год не является високосным. ");
        }
    }
}