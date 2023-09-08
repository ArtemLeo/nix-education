package nix_beginner;

/*
 Створіть програму, яка складає/перемножує/віднімає/ділить два числа і виводить на екран результат.
 Обидва числа та бажана операція мають приходити в аргументах.
 */

public class Task_03 {
    public static void main(String[] args) {
        int firstValue = 12;
        int secondValue = 40;
        String operation = "+";

        calculate(firstValue, secondValue, operation);
    }

    private static void calculate(int firstValue, int secondValue, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                    break;
                } else {
                    System.out.println("Error: Division by zero is allowed!");
                }
        }
        System.out.println(firstValue + " " + operation + " " + secondValue + " = " + result);
    }
}
