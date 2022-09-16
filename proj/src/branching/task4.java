package branching;

import java.util.Scanner;

public class task4 {

    static String task = "Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.\n" +
            "Определить, пройдет ли кирпич через отверстие.";

    double x, y, z;
    double a, b;
    boolean answer;

    public static void main(String[] args){
        System.out.println("This task is: " + task);
        task4 task = new task4();
        task.start();

        if (task.answer)
            System.out.println("The object fits into the hole");
        else
            System.out.println("The object doesn't fit into the hole");
    }

    void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A & B");
        System.out.print("A > ");
        a = in.nextDouble();
        System.out.print("B > ");
        b = in.nextDouble();
        System.out.println("Enter x, y, z");
        System.out.print("x > ");
        x = in.nextDouble();
        System.out.print("y > ");
        y = in.nextDouble();
        System.out.print("z > ");
        z = in.nextDouble();

        logic();

    }

    void logic(){
        if (x <= a){
            if (y <= b || z <= b){
                answer = true;
                return;
            }
        }
        if (y <= a){
            if (x <= b || z <= b){
                answer = true;
                return;
            }
        }
        if (z <= a){
            if (x <= b || y <= b){
                answer = true;
                return;
            }
        }

        answer = false;
        return;
    }
}