import java.util.Scanner;

public class DataTypes {

 public static void main(String[] args){
       int cats = 5;
       int monkeysEnterd;
       int bag ;
       System.out.println(" Number of cats = " + cats );
        bag = cats;
     System.out.println(" Number of cats in the bag = " + bag );
     System.out.println(" how many more cats do you want to add to the bag" );
     Scanner inputDevice = new Scanner(System.in);

     monkeysEnterd = inputDevice.nextInt() ;

     bag = cats + monkeysEnterd;

     System.out.println("there are now " + bag + " cats in the bag" );
      bag = bag /(1 + (int)(Math.random()*10)) ;
     System.out.println("due to overpopulation and deaises you killed the cats\n " +
     " there are now only " + bag + " cats left in the bag. SAD!");


 }
}
