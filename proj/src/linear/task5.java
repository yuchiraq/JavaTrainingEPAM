package linear;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args){
        task5 task5 = new task5();
        System.out.println("This task is: " + task5.task);
        task5.start();
    }

    String task = "Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. Вывести данное значение в форме: HHч MMмин SSс";

    double secInput;
    double sec;
    int min, hours;

    public void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur county of sec:");
        System.out.print("sec > ");
        secInput = in.nextDouble();
        System.out.print(secInput + " sec = ");
        logic();
        if(sec % 1 == 0)
            System.out.println(hours + "ч " + min + "мин " + (int)sec + "c");
        else
            System.out.println(hours + "ч " + min + "мин " + sec + "c");
        return;
    }

    void logic(){
        min = (int)(secInput / 60);
        hours = min / 60;
        min = min % 60;
        sec = secInput % 60;
        return;
    }
}
