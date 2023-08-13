package nix_beginner;

// Створіть програму, яка виведе на екран таблицю множення;

public class Task_07 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[10][10];
        MultiplicationTable(doubleArray);
    }

    private static void MultiplicationTable(int[][] doubleArray) {
        for (int i = 1; i < doubleArray.length; i++) {
            for (int j = 1; j < doubleArray.length; j++) {
                doubleArray[i - 1][j - 1] = i * j;
                System.out.print(doubleArray[i - 1][j - 1]);
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
