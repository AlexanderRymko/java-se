package by.rymko.home;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Введенное число a является положительным. ");
        } else {
            System.out.println("Введенное число a является отрицательным. ");
        }
    }
}
