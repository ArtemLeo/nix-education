package nix_beginner;

// Створіть массив чисел и выведите этот массив на экран;

import java.util.Arrays;

public class Task_04 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7, 15};
        showArray(array);
    }

    private static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
