package by.rymko.home;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Как тебя зовут? Назови своё имя.");
        String name = scanner.nextLine();
        System.out.print("Привет, " + name);
        System.out.println("!");
    }
}
