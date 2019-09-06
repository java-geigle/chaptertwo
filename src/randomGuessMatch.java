import javax.swing.*;

public class randomGuessMatch {
    public static void main(String[] args){
       int answer = 1 + (int)(Math.random()* 5);
       int guess;
       boolean yes;


       String Sguess= JOptionPane.showInputDialog(null," pick a number between 1 and 5. ",
       "log", JOptionPane.INFORMATION_MESSAGE);
        guess = Integer.parseInt(Sguess);


        if( guess == answer)
        JOptionPane.showMessageDialog(null, "yes") ;
//        else
//        JOptionPane.showMessageDialog(null,"the no.") ;








    }
}
