import linear.*;

import java.util.Scanner;


public class MainMenu {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        menuLinear();
        System.out.println("Bye `-`");
    }

    private static class tasksLinear {
        static String task1 = "Найдите значение функции: z = ( (a - 3) * b / 2 ) + c";
        static String task2 = "Вычислить (переменные - действительные числа): ( (b + sqrt(b^2 + 4ac)) / 2a ) - a^3 * c + b^(-2)";
        static String task3 = "Вычислить (переменные - действительные числа): ( (sin(x)+cos(y)) / (cos(x) - sin(y)) ) * tg(xy)";
        static String task4 = "Дано действительное число R вида nnn.ddd (по три цифры в целой и дробной частях), поменять местами эти части";
        static String task5 = "Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. Вывести данное значение в форме: HHч MMмин SSс";
        static String task6 = "Вывод true, если введённая координата (х,у) входит в закрашенную область данного графика. False если не входит";
    }

    static void menuLinear(){
        Scanner read = new Scanner(System.in);
        int key = 50;
        while (true){
            System.out.println("Enter the task num:");
            System.out.println("0 - Exit");
            System.out.println("1 - " + tasksLinear.task1);
            System.out.println("2 - " + tasksLinear.task2);
            System.out.println("3 - " + tasksLinear.task3);
            System.out.println("4 - " + tasksLinear.task4);
            System.out.println("5 - " + tasksLinear.task5);
            System.out.println("6 - " + tasksLinear.task6);
            System.out.print("> ");
            key = read.nextInt();
            System.out.println();
            System.out.println();
            switch (key){
                case 0:
                    return;
                case 1:
                    System.out.println("You have chosen task 1:");
                    task1 task1 = new task1();
                    task1.start();
                    task1 = null;
                    break;
                case 2:
                    System.out.println("You have chosen task 2:");
                    task2 task2 = new task2();
                    task2.start();
                    task2 = null;
                    break;
                case 3:
                    System.out.println("You have chosen task 3:");
                    task3 task3 = new task3();
                    task3.start();
                    task3 = null;
                    break;
                case 4:
                    System.out.println("You have chosen task 4:");
                    task4 task4 = new task4();
                    task4.start();
                    task4 = null;
                    break;
                case 5:
                    System.out.println("You have chosen task 5:");
                    task5 task5 = new task5();
                    task5.start();
                    task5 = null;
                    break;
                case 6:
                    System.out.println("You have chosen task 6:");
                    task6 task6 = new task6();
                    linear.task6.main();
                    task6 = null;
                    break;
                case 50:
                    System.out.println("Error of input");
                default:
                    System.out.println("Error: Check num of task!");
            }
            System.out.println();
            System.out.println();
            key = 50;
        }
    }
}