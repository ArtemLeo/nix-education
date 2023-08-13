package nix_beginner;

// Створіть програму, яка виведе на екран числа фібоначі до вказаного числа. Число має приходити в аргументах;

public class Task_08 {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        int limit = 50;
        System.out.print(n1 + " " + n2); // printing 0 and 1
        printFibonacci(limit); // n-2 because 2 numbers are already printed

    }

    static void printFibonacci(int limit) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        if (n3 < limit) {
            System.out.print(" " + n3);
            printFibonacci(limit);
        }
    }
}
