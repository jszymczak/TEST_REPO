package tic_tac_toe_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstBox = new int[3];
        int[] secondBox = new int[3];
        boolean firstBigger = false;
        boolean secondBigger = false;
        boolean isEqual = false;
        boolean isIncomparable = false;

        for (int i = 0; i < firstBox.length; i++) {
            firstBox[i] = scanner.nextInt();
        }
        for (int i = 0; i < secondBox.length; i++) {
            secondBox[i] = scanner.nextInt();
        }

        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        if (Arrays.equals(firstBox, secondBox)) {
            System.out.println("Box 1 = Box 2");
            isEqual = true;
        }

        if (firstBox[0] < secondBox[0] && firstBox[2] > secondBox[2] ||
                firstBox[0] > secondBox[0] && firstBox[2] < secondBox[2]) {
            System.out.println("Incomparable");
            isIncomparable = true;
        }

        System.out.println(Arrays.toString(firstBox));
        System.out.println(Arrays.toString(secondBox));

        for (int i = 0; i < 3; i++) {
            if (isIncomparable || isEqual) {
                break;
            }
            if (firstBox[i] < secondBox[i]) {
                secondBigger = true;
            }
            if (firstBox[i] > secondBox[i]) {
                firstBigger = true;
            }
        }

        if (firstBigger) {
            System.out.println("Box 1 > Box 2");
        } else if (secondBigger) {
            System.out.println("Box 1 < Box 2");
        }
    }

}
