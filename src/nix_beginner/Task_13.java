package nix_beginner;

// Напишіть програму, яка порахує min та max значення в масиві.

public class Task_13 {
    public static void main(String[] args) {
        int[] array = {24, 13, -1, 2, 4, 70, 44, -12, 134};
        int minValue = printMin(array);
        int maxValue = printMax(array);
        System.out.println("Min value = " + minValue + ", Max value = " + maxValue);
    }

    private static int printMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int printMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

