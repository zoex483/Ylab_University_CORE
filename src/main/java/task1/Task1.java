package task1;

import java.util.Random;

public class Task1 {

    public static void main(String[]args){
        Random rand = new Random ();
        int [] [] array = new int [10][10];
        // fill array with random number
        for(int i = 0; i < array.length; i++){
            for (int j= 0; j < array.length; j++){
                array [i][j] = rand.nextInt(100);
                System.out.print(" " + array[i][j] + " ");// to split arrays
                // print the matrix
                System.out.print(array[i][j] + "");
            }
            System.out.println();
        }
        // calculate min, max, average
        int counter = 0;
        int summ = 0;
        int min = array [0][0];
        int max = array [0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(min > array [i][j]){
                    min = array [i][j];
                }
                if (max < array [i][j]){
                    max = array [i][j];
                }
                // calculate summ and average
                summ = summ+array[i][j];
                counter++;
            }
        }
        System.out.println("min number "+min);
        System.out.println("max number " +max);
        System.out.println("average " +summ/counter);
    }
}


