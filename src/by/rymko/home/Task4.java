package by.rymko.home;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int array1[][] = new int[10][10];
        int i, j;
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array1[i].length; j++) {
                if (i == j||i+j== (array1[i].length-1)) {
                    array1[i][j] = 1;
                }
                System.out.print(array1[i][j] + "  ");
            }
            System.out.println();
        }
       }
}

