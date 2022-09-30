package loops;

import static java.lang.Math.pow;

public class task4 {

    public static String task = "Составить программу нахождения произведения квадратов первых двухсот чисел.";

    public static void main(String[] args){

        task4 thisTask = new task4();
        System.out.println("This task is: " + thisTask.task);

        System.out.println("\nAnswer = " + thisTask.logic(200));

    }

    long logic(double maxValue){
        long answer = 1;
        long temp = 1;

        for (int i = 1; i <= maxValue; i++) {
            temp *= pow(i, 2);
            if (temp == Long.MAX_VALUE) {
                System.out.println("\nДальнейшее вычисление невозможно из-за переполнения типа long\n" +
                        "Последнее число: " + i);
                return answer;
            } else {
                answer = temp;
            }
        }

        return answer;
    }
}
