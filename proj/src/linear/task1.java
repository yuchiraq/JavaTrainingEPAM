package linear;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        task1 task1 = new task1();
        System.out.println("This task is: " + task1.task);
        task1.start();
    }

    String task = "Найдите значение функции: z = ( (a - 3) * b / 2 ) + c";

    double a, b, c, z;

    public double start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur variables:");
        System.out.print("a > ");
        a = in.nextDouble();
        System.out.print("b > ");
        b = in.nextDouble();
        System.out.print("c > ");
        c = in.nextDouble();
        System.out.print("z = ( (" + a + "-3) * " + b + "/2 ) + " + c);
        logic();
        System.out.println(" = " + z);
        return z;
    }

    double logic(){
        z = ( (a-3) * b / 2) + c;
        return z;
    }
}
