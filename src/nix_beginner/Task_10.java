package nix_beginner;

/*
 Створіть програму, яка виводитиме числа послідовно у вигляді трикутника (floyd triangle).
 Число має приходити в аргументах, приклад виведення у наступній колонці;
 */

public class Task_10 {
    public static void main(String[] args) {
        int value = 6;
        printTriangle(value);
    }

    private static void printTriangle(int value) {
        int variable = 1;
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(variable + " ");
                variable++;
            }
            System.out.println();
        }
    }
}
