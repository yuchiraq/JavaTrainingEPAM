package linear;

import java.util.Scanner;

public class task4 {

    String task = "Дано действительное число R вида nnn.ddd (по три цифры в целой и дробной частях), поменять местами эти части";

    double r, n, d;
    String str;
    char[] strConverted = new char[7];

    public static void main(String[] args){
        task4 task4 = new task4();
        System.out.println("This task is: " + task4.task);
        task4.start();
    }

    public void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur variables:");
        System.out.print("r > ");
        r = in.nextDouble();

        if(!logic())
            return;

        System.out.println(strConverted);
    }

    boolean logic(){
        int j = 0;
        str = String.valueOf(r);
        if(str.length() != 7 || str.charAt(3) != '.'){
            System.out.println("Error: check task!");
            return false;
        }
        for (int i = 4; i < 7; i++) {
            strConverted[j] = str.charAt(i);
            j++;
        }
        strConverted[j] = '.';
        for (int i = 0; i < 3; i++) {
            j++;
            strConverted[j] = str.charAt(i);
        }
        return true;
    }
}
