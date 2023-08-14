package nix_beginner;

// Напишіть програму, яка рахуватиме середнє значення в масиві позитивних чисел.

public class Task_12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 30, 5, 70, 44};
        float average = printAverageOfArrValue(array);
        System.out.println(average);
    }

    private static float printAverageOfArrValue(int[] array) {
        int sum = 0;
        int count = 0;
        for (int j : array) {
            if (j >= 0) {
                sum += j;
                count++;
            }
        }
        return (float) sum / count;
    }
}

