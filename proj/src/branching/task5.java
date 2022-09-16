package branching;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class task5 {

    public static String task = "Вычислить значение функции:";

    double x, answer;

    public static void main(String[] args){
        task5 taskClass = new task5();
        System.out.println("This task is: " + task);

        BufferedImage taskIm = null;
        JFrame f = null;
        try{
            taskIm = ImageIO.read(new File("src/branching/task5.jpg"));
        }catch (IOException exception){
            System.out.println("Error of open image wth task");
        }
        if(taskIm != null){
            JLabel picLabel = new JLabel(new ImageIcon(taskIm));
            JPanel jPanel = new JPanel();
            jPanel.add(picLabel);
            f = new JFrame();
            f.setSize(433, 180);
            f.add(jPanel);
            f.setVisible(true);
            f.toFront();
        }

        taskClass.start();

        if (taskClass.x > 3)
            System.out.println("x > 3\n" +
                    "Answer = " + taskClass.answer);
        else
            System.out.println("x <= 3\n" +
                    "Answer = " + taskClass.answer);

        if(taskIm != null && f.isVisible())
            f.setVisible(false);
        return;
    }

    void start(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ur x:\n" +
                "> ");
        x = in.nextDouble();

        logic();
    }

    void logic(){
        if (x > 3)
            logicIfLarger();
        else
            logicIfLess();
    }

    void logicIfLarger(){

    }

    void logicIfLess(){

    }
}
