package by.rymko.home.homework2;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("Игра угадай число от 0 до 9");
        System.out.println();
        int mark = (int) (Math.random() * 9); // Генерируем случайное число.
        System.out.println("Загаданная цифра это " + mark);
        Scanner in = new Scanner(System.in);
        int inmark[] = new int[3];
        for (int i = 0; i < inmark.length; i++) {
            System.out.println("Попытка № " + (i + 1));
            System.out.println("Введите случайное число от 0 до 9");
            inmark[i] = in.nextInt(); // Число, которое вводится с клавиатуры
            if (inmark[i] == mark) {
                System.out.println("You WIN");
                break;
            } else {
                if (inmark[i] < mark) {
                    System.out.println("Введенное число меньше загаданного");
                } else {
                    System.out.println("Введенное число больше загаданного ");
                }
            }
        }
    }
    }

