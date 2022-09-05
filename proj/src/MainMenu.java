import java.util.Scanner;


public class MainMenu {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        menu();
        System.out.println("Bye `-`");
    }

    private static class tasks{
        static String task1 = "Найдите значение функции: z = ( (a - 3) * b / 2 ) + c";
        static String task2 = "Вычислить (переменные - действительные числа): ( (b + sqrt(b^2 + 4ac)) / 2a ) - a^3 * c + b^(-2)";
        static String task3 = "Вычислить (переменные - действительные числа): ( (sin(x)+cos(y)) / (cos(x) - sin(y)) ) * tg(xy)";
    }

    static void menu(){
        Scanner read = new Scanner(System.in);
        int key = 50;
        while (true){
            System.out.println("Enter the task num:");
            System.out.println("0 - Exit");
            System.out.println("1 - " + tasks.task1);
            System.out.println("2 - " + tasks.task2);
            System.out.println("3 - " + tasks.task3);
            System.out.print("> ");
            key = read.nextInt();
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
                case 50:
                    System.out.println("Error of input");
                default:
                    System.out.println("Error: Check num of task!");
            }
            key = 50;
        }
    }
}