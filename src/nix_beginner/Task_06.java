package nix_beginner;

// Створіть програму, яка приймає ціле число та підсумовує його цифри. Число має приходити в аргументах;

public class Task_06 {
    public static void main(String[] args) {
        int number = 123;
        int result = sumOfNumber(number);
        System.out.println("Сумма цифр числа " + number + " = " + result);
    }

    private static int sumOfNumber(int number) {
        int result = 0;
        for (int i = (number > 0 ? number : number * -1); i > 0; i /= 10) {
            result += i % 10;
        }
        return result;
    }
}
