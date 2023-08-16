package nix_beginner;

// Напишіть програму, яка інвертує масив (значення повинні йти у зворотному порядку).

import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 30, 5, 70, 44};
        int[] reverseArray = reverseArray(array);
        System.out.println(Arrays.toString(reverseArray));
    }

    private static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[array.length - 1 - i] = array[i];
        }
        return reverse;
    }
}

