package branching;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args){
        branching.task2 task2 = new branching.task2();
        System.out.println("This task is: " + task2.task);
        task2.start();
        System.out.println("Answer: " + task2.answer);
    }

    String task = "Найти max{min(a, b), min(c, d)}.";

    double a, b, c, d;
    double answer;

    public double start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur variables:");
        System.out.print("a > ");
        a = in.nextDouble();
        System.out.print("b > ");
        b = in.nextDouble();
        System.out.print("c > ");
        c = in.nextDouble();
        System.out.print("d > ");
        d = in.nextDouble();
        answer = max(min(a, b), min(c, d));
        return answer;
    }

    double min(double frst, double sec){
        if(frst > sec)
            return sec;
        else
            return frst;
    }

    double max(double frst, double sec){
        if(frst > sec)
            return frst;
        else
            return sec;
    }

}
