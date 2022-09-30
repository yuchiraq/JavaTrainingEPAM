package linear;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;




public class task6 {

    String task = "Вывод true, если введённая координата (х,у) входит в закрашенную область данного графика. False если не входит";

    double x, y;
    boolean answer;

    public static void main(String[] args){
        task6 task6 = new task6();
        System.out.println("This task is: " + task6.task);
        BufferedImage taskIm = null;
        JFrame f = null;
        try{
            taskIm = ImageIO.read(new File("src/linear/task6.jpg"));
        }catch (IOException exception){
            System.out.println("Error of open image wth task");
        }
        if(taskIm != null){
            JLabel picLabel = new JLabel(new ImageIcon(taskIm));
            JPanel jPanel = new JPanel();
            jPanel.add(picLabel);
            f = new JFrame();
            //f.setSize(new Dimension(taskIm.getWidth(), taskIm.getHeight()));
            f.setSize(380, 350);
            f.add(jPanel);
            f.setVisible(true);
            f.toFront();
        }

        task6.start();

        if(taskIm != null && f.isVisible())
            f.setVisible(false);
    }

    boolean start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur coordinates:");
        System.out.print("x > ");
        x = in.nextDouble();
        System.out.print("y > ");
        y = in.nextDouble();

        logic();
        if(answer)
            System.out.println("true");
        else
            System.out.println("false");
        return answer;
    }

    boolean logic(){
        if(x < -4 || x > 4 || y < -3 || y > 4){
            answer = false;
            return answer;
        }
        if(y > 0 && x >= -2 && x <= 2){
            answer = true;
            return answer;
        } else if(y <= 0){
            answer = true;
            return answer;
        }else {
            answer = false;
            return answer;
        }
    }
}
