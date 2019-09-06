import javax.swing.*;

public class randomGuessMatch {
    public static void main(String[] args){
       int answer = 1 + (int)(Math.random()* 5);
       int guess;



       String Sguess= JOptionPane.showInputDialog(null," pick a number between 1 and 5. ",
       "log", JOptionPane.INFORMATION_MESSAGE);
        guess = Integer.parseInt(Sguess);
        boolean equalTo = answer == guess;


        JOptionPane.showMessageDialog(null,"Is it equal?. " + equalTo) ;








    }
}
