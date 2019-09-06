import java.util.Scanner;

public class QuartsToGallons {
    public static void main(String[] args){
        int numQuarts;
        int numGallons;
        int quartsRemaning;
        final int NUM_QUARTS_IN_GALLON =4;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the number of quarts you have");
        numQuarts = keyboard.nextInt();
        numGallons = numQuarts / NUM_QUARTS_IN_GALLON;
        quartsRemaning = numQuarts % NUM_QUARTS_IN_GALLON;

        System.out.println("the number of gallons is "+ numGallons+" with "+quartsRemaning+" quarts remaining" );

    }
}
