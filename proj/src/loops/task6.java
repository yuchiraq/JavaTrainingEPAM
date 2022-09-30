package loops;

public class task6 {

    String task = "Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера.";

    public static void main(String[] args){
        task6 thisTask = new task6();

        System.out.println("This task is: " + thisTask.task);

        thisTask.logic();
    }

    void logic(){

        for (int i = 0; i < 74000; i++) {                         //max = Integer.MAX_VALUE, поставил сколько в мою консоль влезло
            System.out.print(" | " + i + " = " + (char)i + " ");
            if (i % 12 == 0)
                System.out.print(" |\n");
        }

    }
}
