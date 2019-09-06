import javax.swing.*;
import java.util.Scanner;

public class inchesToFeet {
    public static void main(String[] args){
        int inch;
       int feet;
       final int LIFE = 12;
       int input;
       String object = JOptionPane.showInputDialog(null,"how many inches?",
               "dialog", JOptionPane.INFORMATION_MESSAGE);
       input = Integer.parseInt(object);

       feet = input / LIFE;
       inch = input % LIFE;


       JOptionPane.showMessageDialog(null, "the number of feet is "+ feet +" with "+ inch + " inches" );




    }
}
