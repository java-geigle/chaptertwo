import javax.swing.*;
import java.util.Scanner;

public class madLib {
    public static void main(String[] args) {

        String color;
        String est;
        String bodypart;
        String animal;
        String noun;
        String pluralNoun;


        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);

        System.out.print("enter a color");
        color = input.nextLine();
        System.out.print("enter a word ending in est");
        est = input.nextLine();
        System.out.print("enter body parts");
        bodypart = input.nextLine();
        System.out.print("enter an animal");
        animal = input.nextLine();
        System.out.print("enter a noun");
        noun = input.nextLine();
        System.out.print("enter a plural noun");
        pluralNoun = input.nextLine();

        System.out.print("enter a number");
        a = input.nextInt();
        System.out.print("enter another number");
        b = input.nextInt();
        c = a%b;

        System.out.println("the "+ color +" dragon is the "+ est +" dragon of all.");
        System.out.println(" it has "+ c +" "+bodypart+" and a "+ animal +" shaped like a "+noun+".");
        System.out.println(" it loves to eat"+ pluralNoun +",although it will nearly feast on anything.");





    }
}
