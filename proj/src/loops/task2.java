package loops;

import java.util.ArrayList;
import java.util.Scanner;

public class task2 {

    String task = "Вычислить значения функции на отрезке [а,b] c шагом h:\n" +
            "      _\n" +
            "     / x, x > 2\n" +
            "y = {\n" +
            "     \\ -x, x <= 2\n" +
            "      ‾";

    double a, b, h;

    ArrayList<Double> answers = new ArrayList<Double>();

    public static void main(String[] args){
        task2 taskThis = new task2();
        System.out.println("This task is: " + taskThis.task);

        System.out.println("Enter a, b, h:");
        System.out.print("a > ");
        taskThis.a = enterDoubleFromConsole();
        System.out.print("b > ");
        taskThis.b = enterDoubleFromConsole();
        System.out.print("h > ");

        taskThis.h = enterDoubleFromConsole();
        while (taskThis.h <= 0) {
            System.out.print("h only > 0\nh > ");
            taskThis.h = enterDoubleFromConsole();
        }
        
        taskThis.logic();

        System.out.print("Answers: ");
        int i = 1;

        for ( Double element: taskThis.answers ) {
            System.out.print(i + ") " + element + " ");
            if (i % 10 == 0)
                System.out.print("\n");
            i++;
        }

    }

    void logic(){
        double temp = a;

        do {
            
            if (temp > 2) {
                answers.add(temp);
            } else if (temp == 0) {
                answers.add(0.0);
            } else if (temp <= 2) {
                answers.add(-temp);
            }
            
        }while ((temp += h) <= b);

    }

    static double enterDoubleFromConsole(){

        Scanner input = new Scanner(System.in);

        while (!input.hasNextDouble()) {
            input.next();
            System.out.println("Incorrect value (need double)");
        }

        return input.nextDouble();
    }

}
