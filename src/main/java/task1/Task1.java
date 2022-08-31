package task1;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        int[][] array = new int[10][10];

        fillDimensionalArray(array);
        averageOfDimensionalArr(array);
        maxFromDimensionalArr(array);
        minFromDimensionalArr(array);
    }

    private static void minFromDimensionalArr(int[][] dimensionalArr){
        int min = Integer.MAX_VALUE;
        for (int[] ints : dimensionalArr) {
            for (int j = 0; j < dimensionalArr.length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                }
            }
        }
        System.out.println("Минимальное число в двумерном массиве: " + min);

    }

    // Метод для поиска максимального числа в двумерном массиве dimensionalArr - на вход принимается двумерный массив типа int

    private static void maxFromDimensionalArr(int[][] dimensionalArr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : dimensionalArr) {
            for (int j = 0; j < dimensionalArr.length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        System.out.println("Максильмальное число в двумерном массиве: " + max);
    }

    /**
     * Метод для нахождения среднего в двумерном array - на вход принимает двумерный массив
     */
    private static void averageOfDimensionalArr(int[][] array) {
        int counter = 0;
        int summOfAllDimensionalArrElems = 0;

        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                summOfAllDimensionalArrElems = summOfAllDimensionalArrElems + ints[j];
                counter++;
            }
        }

        System.out.println("Среднее арифметическое двумерного массива: " + summOfAllDimensionalArrElems / counter);
    }

    // fill array with random number
    private static void fillDimensionalArray(int[][] dimensionalArr) {
        Random rand = new Random();
        for (int i = 0; i < dimensionalArr.length; i++) {
            for (int j = 0; j < dimensionalArr.length; j++) {
                dimensionalArr[i][j] = rand.nextInt(100);
                System.out.print(" " + dimensionalArr[i][j] + " ");// to split arrays
                // print the matrix
                System.out.print(dimensionalArr[i][j] + "");
            }
            System.out.println();
        }
    }
}

