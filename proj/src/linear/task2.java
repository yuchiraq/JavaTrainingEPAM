package linear;

import java.util.Scanner;
import java.lang.Math;

public class task2 {

    String task = "Вычислить (переменные - действительные числа): ( (b + sqrt(b^2 + 4ac)) / 2a ) - a^3 * c + b^(-2)";

    double a, b, c, answer;

    public static void main(String[] args){
        task2 task2 = new task2();
        System.out.println("This task is: " + task2.task);
        task2.start();
    }

    public double start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur variables:");
        System.out.print("a > ");
        a = in.nextDouble();
        System.out.print("b > ");
        b = in.nextDouble();
        System.out.print("c > ");
        c = in.nextDouble();
        System.out.print("( (" + b + "+ sqrt(" + b + "^2 + 4*" + a + "*" + c + ")) / 2*" + a + " ) - " + a + "^3 * " + c +" + " + b + "^(-2)");
        logic();
        System.out.println(" = " + answer);
        return answer;
    }

    double logic(){
        double n;
        n = b*b + 4*a*c;
        answer = ( (b + Math.sqrt(n)) / (2 * a) ) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return answer;
    }

}
