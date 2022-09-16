package branching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        branching.task1 task1 = new branching.task1();
        System.out.println("This task is: " + task1.task);
        task1.start();
        System.out.println("Is exist: " + task1.answer.get("isExist").toString());
        if(task1.isExist)
            System.out.println("Is rectangular: " + task1.answer.get("isRectangular").toString());
    }

    String task = "Даны два угла треугольника (в градусах).\n" +
            "Определить, существует ли такой треугольник, и если да,\n" +
            "то будет ли он прямоугольным.";

    double angle1, angle2;
    boolean isExist, isRectangular;
    Map<String, Boolean> answer = new HashMap<String, Boolean>();

    public Map<String, Boolean> start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur angles:");
        System.out.print("/_1 > ");
        angle1 = in.nextDouble();
        System.out.print("/_2 > ");
        angle2 = in.nextDouble();
        logic();
        answer.put("isExist", isExist);
        answer.put("isRectangular", isRectangular);
        return answer;
    }

    void logic(){
        if(angle1 + angle2 < 180){
            isExist = true;
        }else{
            isExist = false;
            isRectangular = false;
            return;
        }

        if(angle1 == 90 || angle2 == 90){
            isRectangular = true;
        }else if(180 - (angle2 + angle1) == 90){
            isRectangular = true;
        }else {
            isRectangular = false;
        }

        return;
    }

}
