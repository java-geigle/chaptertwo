import javax.swing.*;

public class posterFile {
    public static void main(String[] args){

     int poster;
     int boxes;
     int posterRemain;
     final int BOX_LIMIT = 11;
     String posterString =JOptionPane.showInputDialog(null, "how many posters did you order",
                "order Dialog",JOptionPane.INFORMATION_MESSAGE);
     poster = Integer.parseInt(posterString);

     posterRemain = Integer.parseInt(posterString);

     boxes = poster / BOX_LIMIT;
     posterRemain = poster % BOX_LIMIT;

     JOptionPane.showMessageDialog(null, "the number of boxes filled were "+ boxes +
     posterRemain +" left over");

    }
}
