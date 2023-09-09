package nix_beginner;

/*
  Створіть програму, яка виводить введені ім'я та прізвище на екран у різних рядках.
  Ім'я та прізвище мають приходити в аргументах.
 */

public class Task_02 {
    public static void main(String[] args) {
        String input = "Alexey Alekseev";
        splitInput(input);
    }

    private static void splitInput(String input) {
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}