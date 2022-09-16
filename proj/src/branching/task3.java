package branching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args){
        branching.task3 task3 = new branching.task3();
        System.out.println("This task is: " + task3.task);
        task3.start();
        if(task3.answer)
            System.out.println("Points on one straight line");
        else
            System.out.println("Points ain't on one straight line");
    }

    String task = "Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).\n" +
            "Определить, будут ли они расположены на одной прямой.";

    double x1, y1;
    double x2, y2;
    double x3, y3;

    boolean answer;

    public boolean start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur points:");
        System.out.print("A:\n" +
                "x > ");
        x1 = in.nextDouble();
        System.out.print("y > ");
        y1 = in.nextDouble();
        System.out.print("B:\n" +
                "x > ");
        x2 = in.nextDouble();
        System.out.print("y > ");
        y2 = in.nextDouble();
        System.out.print("C:\n" +
                "x > ");
        x3 = in.nextDouble();
        System.out.print("y > ");
        y3 = in.nextDouble();

        answer = logic();

        return answer;
    }

    boolean logic(){
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            return true;
        else
            return false;
    }

}