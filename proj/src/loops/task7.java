package loops;

import java.util.Scanner;

import static java.lang.Math.abs;

public class task7 {

    String task = "Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.\n" +
            "m и n вводятся с клавиатуры.";

    int m, n;

    public static void main(String[] args) {

        task7 thisTask = new task7();
        System.out.println("This task is: " + thisTask.task);

        System.out.println("Enter m & n:");
        System.out.print("m > ");
        thisTask.m = enterIntFromConsole();
        System.out.print("n > ");
        thisTask.n = enterIntFromConsole();

        thisTask.logic();

    }

    void logic() {

        int cur = m;

        for ( ; cur <= n; cur++) {

            System.out.print("For " + cur + ":");
            for (int i = 2; i < abs(cur); i++) {

                if (cur % i == 0) {
                    System.out.print(" " + i);
                }

            }
            System.out.println();

        }

    }

    static int enterIntFromConsole() {

        Scanner input = new Scanner(System.in);

        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Incorrect value (need int)");
        }

        return input.nextInt();
    }

}
