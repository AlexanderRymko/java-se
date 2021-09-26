package by.rymko.home.homework2;

import java.util.Random;
import java.util.Scanner;

public class Task111 {
    public static void main(String[] args) {
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(10);
        random.nextInt(10);
        int userNumber;
        int randomNumber=random.nextInt(10);

        while (isContinue) {
            playGame(scanner, randomNumber);
            isContinue = isReplayGame(isContinue, scanner);
        }
    }

    private static boolean isReplayGame(boolean isContinue, Scanner scanner) {
        System.out.println("Хотите сыграть еще раз? 1 - да, 0 - нет");
        scanner.nextInt();
        if(scanner.nextInt()==0) {
            isContinue = false;
        }
        return isContinue;
    }

    private static void playGame(Scanner scanner, int randomNumber) {
        int userNumber;
        System.out.println("Угадайте число от нуля до десяти");
        for (int i = 0; i < 3; i++) {
            userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("You WIN");
                break;
            } else if (userNumber > randomNumber) {
                System.out.println("Введенное число больше загаданного числа");
            } else {
                System.out.println("Введенное число меньше загаданного числа");
            }
        }
    }
}
