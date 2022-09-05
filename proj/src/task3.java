import java.util.Scanner;
import java.lang.Math;

public class task3 {

    public static void main(String[] args){
        task3 task3 = new task3();
        System.out.println("This task is: " + task3.task);
        task3.start();
    }

    String task = "Вычислить (переменные - действительные числа): ( (sin(x)+cos(y)) / (cos(x) - sin(y)) ) * tg(xy)";

    double x, y ,answer;

    double start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur variables:");
        System.out.print("x > ");
        x = in.nextDouble();
        System.out.print("y > ");
        y = in.nextDouble();
        System.out.print("( (sin(x)+cos(y)) / (cos(x) - sin(y)) ) * tg(xy) ");
        logic();
        System.out.println(" = " + answer);
        return answer;
    }

    double logic(){
        answer = ( (Math.sin(x)+Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) * Math.tan(x*y);
        return answer;
    }
}
