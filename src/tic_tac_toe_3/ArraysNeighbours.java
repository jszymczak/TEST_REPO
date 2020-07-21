package tic_tac_toe_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysNeighbours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = "";
        final String END = "end";
        List<String> testList = new ArrayList<>();
        List<String> testArray = testList;

        do {
            temp = scanner.nextLine();
            if (!END.equals(temp)) {
                testList.add(temp);
            } else {
                break;
            }
        } while (scanner.hasNext());

        int listSize = testList.size();
        int listSizeMinusOne = listSize - 1;

        int[][] firstArray = new int[listSize][listSize];
        int[][] secondArray = new int[listSize][listSize];

        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize; j++) {
                 testArray = Arrays.asList(testList.get(i).split("\\s+"));
                 firstArray[i][j] = Integer.parseInt(testArray.get(j));
            }
        }

        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize; j++) {
                boolean iIsZero = i == 0;
                boolean jIsZero = j == 0;
                boolean jIsLast = j == listSizeMinusOne;
                boolean iIsLast = i == listSizeMinusOne;
                if (iIsZero) {
                    if (jIsZero) {
                        secondArray[i][j] = firstArray[i + 1][j] + firstArray[listSizeMinusOne][j]
                                + firstArray[i][j + 1] + firstArray[i][listSizeMinusOne];
                    } else if (jIsLast) {
                        secondArray[i][j] = firstArray[i + 1][j] + firstArray[listSizeMinusOne][j]
                                + firstArray[i][0] + firstArray[i][j - 1];
                    } else {
                        secondArray[i][j] = firstArray[i + 1][j] + firstArray[listSizeMinusOne][j]
                                + firstArray[i][j + 1] + firstArray[i][j - 1];
                    }
                } else if (iIsLast) {
                    if (jIsZero) {
                        secondArray[i][j] = firstArray[i - 1][j] + firstArray[0][j]
                                + firstArray[i][j + 1] + firstArray[i][0];
                    } else if (jIsLast){
                        secondArray[i][j] = firstArray[i - 1][j] + firstArray[0][j]
                                + firstArray[i][j - 1] + firstArray[i][0];
                    } else {
                        secondArray[i][j] = firstArray[i - 1][j] + firstArray[0][j]
                                + firstArray[i][j + 1] + firstArray[i][j - 1];
                    }
                } else if (jIsZero) {
                    secondArray[i][j] = firstArray[i + 1][j] + firstArray[i - 1][j]
                            + firstArray[i][j + 1] + firstArray[i][listSizeMinusOne];
                } else if (jIsLast) {
                    secondArray[i][j] = firstArray[i + 1][j] + firstArray[i - 1][j]
                            + firstArray[i][0] + firstArray[i][j - 1];
                } else {
                    secondArray[i][j] = firstArray[i + 1][j] + firstArray[i - 1][j]
                            + firstArray[i][j + 1] + firstArray[i][j - 1];
                }
            }
        }

        for (int i = 0; i < listSize; i++) {
            System.out.println(Arrays.toString(secondArray[i]));
        }
    }
}
