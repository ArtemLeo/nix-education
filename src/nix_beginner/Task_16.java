package nix_beginner;

// Напишіть програму, яка знайде перетин у двох масивах чисел.

public class Task_16 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 7, 30, 5, 70, 44};
        int[] array2 = {19, 4, 25, 17, 28, 99, 30, 1, 93};
        printIntersection(array1, array2);
    }

    private static void printIntersection(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Найдено пересечение в массивах: " + array1[i]);
                }
            }
        }
    }
}

