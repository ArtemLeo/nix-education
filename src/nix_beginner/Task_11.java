package nix_beginner;

// Напишіть програму, яка відсортує масив за зростанням.

import java.util.Arrays;

public class Task_11 {
    public static void main(String[] args) {
        int[] array = {24, 13, -1, 2, 4, 70, 44};
        bubbleSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

