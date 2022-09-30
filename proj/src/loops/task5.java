package loops;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class task5 {

    double e;
    double answer = 0;
    int n;

    public static String task = "Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен\n" +
            "заданному е. Общий член ряда имеет вид:";

    public static void main(String[] args){
        task5 thisTask = new task5();
        BufferedImage taskIm = null;
        JFrame f = null;

        System.out.println("This task is: " + thisTask.task);

        try{
            taskIm = ImageIO.read(new File("src/loops/task5.png"));
        }catch (IOException exception){
            System.out.println("Error of open image wth task");
        }
        if(taskIm != null){
            JLabel picLabel = new JLabel(new ImageIcon(taskIm));
            JPanel jPanel = new JPanel();
            jPanel.add(picLabel);
            f = new JFrame();
            //f.setSize(new Dimension(taskIm.getWidth(), taskIm.getHeight()));
            f.setSize(180, 120);
            f.add(jPanel);
            f.setVisible(true);
            f.toFront();
        }

        System.out.print("Enter e\n" +
                "> ");
        thisTask.e = enterDoubleFromConsole();

        thisTask.logic();

        System.out.println("Answer = " + thisTask.answer);
        System.out.println("Max n = " + --thisTask.n);

        if(taskIm != null && f.isVisible())
            f.setVisible(false);
        return;
    }

    void logic(){
        double temp = 0;
        n = 1;

        temp = (1 / pow(2, n)) + (1 / pow(3, n));
        while (abs(temp) >= e) {
            answer += temp;
            n++;
            temp = (1 / pow(2, n)) + (1 / pow(3, n));
        }
    }

    static double enterDoubleFromConsole(){

        Scanner input = new Scanner(System.in);

        while (!input.hasNextDouble()) {
            input.next();
            System.out.println("Incorrect value (need double)");
        }

        return input.nextDouble();
    }

}