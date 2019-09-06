import javax.swing.*;

public class egg {
    public static void main(String[] args){

        int eggInput;
        double total;
        int dozenTotal;
        int eggTotal;
        final double eggCost = .45;
        final int DOZEN = 12;
        final double DOZEN_COST = 3.25;

        String object = JOptionPane.showInputDialog(null, "how many eggs would you like to purchase?",
                "dialog", JOptionPane.INFORMATION_MESSAGE);
        eggInput = Integer.parseInt(object);

           dozenTotal = eggInput / DOZEN;
           eggTotal = eggInput % DOZEN;
           total = ( dozenTotal * DOZEN_COST ) + ( eggTotal * eggCost );
           JOptionPane.showMessageDialog(null, "your total cost is $"+ total +" with " + dozenTotal +
           " dozen eggs at $3.25 per dozen and "+ eggTotal+" loose eggs at $.45 per egg");


    }
}
