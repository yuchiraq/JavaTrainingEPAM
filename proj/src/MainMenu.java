import branching.task1;
import linear.*;
import branching.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class MainMenu {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        menuMain();
        System.out.println("Bye `-`");
        return;
    }

    static void menuMain(){
        Scanner read = new Scanner(System.in);
        int key = 50;
        while(true){
            System.out.println("Enter part:");
            System.out.println("0 - Exit");
            System.out.println("1 - Linear");
            System.out.println("2 - Branching");
            System.out.println("3 - Loops");
            System.out.print("> ");
            key = read.nextInt();
            System.out.println();
            System.out.println();
            switch(key){
                case 0:
                    return;
                case 1:
                    menuLinear();
                    break;
                case 2:
                    menuBranching();
                    break;
                default:
                    System.out.println("Check ur input!");
            }
        }
    }

    private static class tasksBranching{
        static String task1 = "Даны два угла треугольника (в градусах).\n" +
                "Определить, существует ли такой треугольник, и если да,\n" +
                "то будет ли он прямоугольным.";
        static String task2 = "Найти max{min(a, b), min(c, d)}.";
        static String task3 = "Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).\n" +
                "Определить, будут ли они расположены на одной прямой.";
        static String task4 = "Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.\n" +
                "Определить, пройдет ли кирпич через отверстие.";
        static String task5 = "Вычислить значение функции:";
    }

    static void menuBranching(){
        Scanner read = new Scanner(System.in);
        int key = 50;
        String[] args = null;
        while (true){
            System.out.println("Enter the task num:");
            System.out.println("0 - Exit");
            System.out.println("1 - " + tasksBranching.task1);
            System.out.println("2 - " + tasksBranching.task2);
            System.out.println("3 - " + tasksBranching.task3);
            System.out.println("4 - " + tasksBranching.task4);
            System.out.println("5 - " + tasksBranching.task5);
            System.out.print("> ");
            key = read.nextInt();
            System.out.println();
            System.out.println();
            switch (key){
                case 0:
                    return;
                case 1:
                    System.out.println("You have chosen task 1:");
                    branching.task1.main(args);
                    break;
                case 2:
                    System.out.println("You have chosen task 2:");
                    branching.task2.main(args);
                    break;
                case 3:
                    System.out.println("You have chosen task 3:");
                    branching.task3.main(args);
                    break;
                case 4:
                    System.out.println("You have chosen task 4:");
                    branching.task4.main(args);
                    break;
                case 5:
                    System.out.println("You have chosen task 5:");
                    branching.task5.main(args);
                    break;
                default:
                    System.out.println("Error: Check num of task!");
            }
            System.out.println();
            System.out.println();
            key = 50;
            try{
                TimeUnit.SECONDS.sleep(3);
                System.out.println("wait 3 sec");
            }catch (InterruptedException exception){
                System.out.println(exception.toString());
            }
        }
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
        String[] args = null;
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
                    linear.task1 task1 = new linear.task1();
                    task1.start();
                    task1 = null;
                    break;
                case 2:
                    System.out.println("You have chosen task 2:");
                    linear.task2 task2 = new linear.task2();
                    task2.start();
                    task2 = null;
                    break;
                case 3:
                    System.out.println("You have chosen task 3:");
                    linear.task3 task3 = new linear.task3();
                    task3.start();
                    task3 = null;
                    break;
                case 4:
                    System.out.println("You have chosen task 4:");
                    linear.task4 task4 = new linear.task4();
                    task4.start();
                    task4 = null;
                    break;
                case 5:
                    System.out.println("You have chosen task 5:");
                    linear.task5 task5 = new linear.task5();
                    task5.start();
                    task5 = null;
                    break;
                case 6:
                    System.out.println("You have chosen task 6:");
                    linear.task6.main(args);
                    break;
                default:
                    System.out.println("Error: Check num of task!");
            }
            System.out.println();
            System.out.println();
            key = 50;
            try{
                TimeUnit.SECONDS.sleep(3);
                System.out.println("wait 3 sec");
            }catch (InterruptedException exception){
                System.out.println(exception.toString());
            }
        }
    }
}