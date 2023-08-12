package nix_beginner;

// Створіть програму, яка переводить температуру в Фаренгейтах в температуру за Цельсієм;

public class Task_05 {
    public static void main(String[] args) {
        // from F to C:
        double F = 41;
        double resultToC = calculateToC(F);
        System.out.println(F + " градус по F = " + resultToC + " градусам по C");

        // from C to F:
        double C = 41;
        double resultToF = calculateToF(C);
        System.out.println(C + " градус по C = " + resultToF + " градусам по F");
    }

    private static double calculateToF(double C) {
        return (C * 9 / 5) + 32;
    }

    private static double calculateToC(double F) {
        return (F - 32) * 5 / 9;
    }
}

