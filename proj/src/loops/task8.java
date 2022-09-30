package loops;

import java.util.Scanner;

public class task8 {

    String task8 = "Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.";

    Double num1, num2;
    String str1, str2, answer = "";

    public static void main(String[] args) {

        task8 thisTask = new task8();

        System.out.println("This task is: " + thisTask.task8);
        System.out.println("Enter values:");
        System.out.print("First value > ");
        thisTask.num1 = enterDoubleFromConsole();
        System.out.print("Second value > ");
        thisTask.num2 = enterDoubleFromConsole();

        thisTask.logic();
        System.out.print("Answer: ");

        for (int i = 0; i < thisTask.answer.length(); i++) {
            System.out.print(thisTask.answer.charAt(i) + " ");
        }

    }

    void logic() {
                                                                            // {
        if (num1 % 1 == 0) {

            Integer temp1 = num1.intValue();
            str1 = temp1.toString();

        } else {
            str1 = num1.toString();
        }
                                                                            //откидывает .0 если целое значение
        if (num2 % 1 == 0) {

            Integer temp2 = num2.intValue();
            str2 = temp2.toString();

        } else {
            str2 = num2.toString();
        }
                                                                            // }

        for (int i = 0; i < str1.length(); i++) {

            if (str2.indexOf(str1.charAt(i)) >= 0) {

                if (str1.charAt(i) == '-') {
                    continue;
                } else if (str1.charAt(i) == '.'){
                    continue;
                } else if (answer.indexOf(str1.charAt(i)) >= 0) {
                    continue;
                } else {

                    answer += String.valueOf(str1.charAt(i));

                }

            }

        }

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
