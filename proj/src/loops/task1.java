package loops;

import java.util.Scanner;

public class task1 {

    String task = "Напишите программу, где пользователь вводит любое целое положительное число.\n" +
            "А программа суммирует все числа от 1 до введенного пользователем числа.";

    int input, answer = 0;

    public static void main(String[] args){

        task1 taskThis = new task1();

        System.out.println("This task is: " + taskThis.task);

        System.out.print("Enter ur figure > ");
        do{
            if (taskThis.input < 0)
                System.out.println("Input < 0\n" +
                        "Enter another value");
            taskThis.input = enterIntFromConsole();
        }while (taskThis.input < 0);

        taskThis.logic();

        System.out.println("Answer = " + taskThis.answer);

    }

    void logic(){
        while (input != 0) {
            answer += input;
            input--;
        }
    }

    static int enterIntFromConsole(){

        Scanner input = new Scanner(System.in);

        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Incorrect value (need int)");
        }

        return input.nextInt();
    }

}
