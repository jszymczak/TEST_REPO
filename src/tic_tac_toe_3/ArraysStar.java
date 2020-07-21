package tic_tac_toe_3;

import java.util.Scanner;

public class ArraysStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[][] starMatrix = new String[size][size];
        int midElement = size/2;
        System.out.println(midElement);


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == midElement || j == midElement || i + j == size - 1) {
                    starMatrix[i][j] = "*";
                } else {
                    starMatrix[i][j] = ".";
                }
                System.out.print(starMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
