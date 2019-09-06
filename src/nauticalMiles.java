import javax.swing.*;
import java.util.Scanner;

public class nauticalMiles {
    public static void main(String[] args){
        double nautToKilo;
        double nautToMile;
        final double NAUT_MILE = 1.150779;
        final double NAUT_KILO = 1.852;
        double userInputNM;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("how many nautical miles?");
        userInputNM = keyboard.nextInt();

        nautToMile = userInputNM * NAUT_MILE;
        nautToKilo = userInputNM * NAUT_KILO;

        System.out.println("miles = " + nautToMile +"  and  54kilometers = "+nautToKilo);










    }
}
