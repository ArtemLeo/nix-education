package nix_beginner;

// Напишіть програму, яка знайде дублікати в масиві чисел.


public class Task_15 {
    public static void main(String[] args) {
    int[] array = {1, 2, 2, 30, 5, 70, 44, 30};
    printDuplicate(array);
    }

    private static void printDuplicate(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Дубликат найден: " + array[i]);
                }
            }
        }
    }
}

