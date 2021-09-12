package by.rymko.home;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if ((a + b) > 10 & (a + b) <= 20) {
            System.out.println(a + b);
            System.out.println("Сумма чисел a+b лежит в диапазоне от 10 до 20. " + true);
        } else {
            System.out.println("Сумма чисел a+b вне диапазона от 10 до 20. " + false);
        }
    }
}

