package project;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


    }

    //Ex3
    static boolean contains(int arr[], int nr) {
        for (int item : arr) {
            if (nr == item)
                return true;
        }
        return false;
    }

    //Ex4
    static int findElement(int arr[], int nr) {
        if (arr == null)
            return -1;
        int length = arr.length;
        int i = 0;

        while (i < length) {
            if (arr[i] == nr)
                return i;
            else
                i += 1;
        }
        return -1;
    }

    //Ex5
    static void cloneArr(int arr[], int copy[]) {
        copy = arr.clone();
        System.out.println("First array " + Arrays.toString(arr));
        System.out.println("Second array " + Arrays.toString(copy));
    }

    //Ex6
    static void oddEven(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("Number " + arr[i] + " is Even");
            else
                System.out.println("Number " + arr[i] + " is Odd");
        }
    }

    //Ex7
    static void equal(int arr1[], int arr2[]) {
        System.out.println(Arrays.equals(arr1, arr2));
    }

    // Exercise #6.4 print the grid
    static void printGrid(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("- ", arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}




