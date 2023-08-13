package nix_beginner;

// Напишіть генератор випадкових чисел (від 1 до 7), виведіть день тижня, що відповідає числу;

import java.util.Random;

public class Task_09 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = generateRandomNumber(random);
        switch (randomNumber){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Incorrect input! Please repeat ...");
        }
    }

    private static int generateRandomNumber(Random random) {
        return random.nextInt(7) + 1;
    }
}
