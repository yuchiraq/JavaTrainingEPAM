package loops;

import static java.lang.Math.pow;

public class task3 {

    String task = "Найти сумму квадратов первых ста числел";

    // Натуральных чисел???

    public static void main(String[] args){

        task3 thisTask = new task3();
        System.out.println("This task is: " + thisTask.task);

        System.out.println("\nAnswer = " + thisTask.logic(100));

    }

    long logic(double maxValue){
        long answer = 0;

        while ( maxValue > 0 ){

            answer += pow(maxValue, 2);
            maxValue--;

        }

        return answer;
    }

}
