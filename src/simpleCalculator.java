import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args){

//        int x = 10;
//        double y = 9.999999999;
//        byte z = 127;
//        long l =19000000000000000L;
//        short s = 32667;
//        System.out.println(x + " number is how large a data type you can use and it is \n"+
//        "4 bytes in size ");
//        System.out.println(y + " number is larger than an int but in decimals ");
//        System.out.println(z + " a byte data type is small in size and is only 1 byte");
//        System.out.println(l + " is the largest and takes 8 bytes ");
//        System.out.println(s + " short data type is only 2 bytes of memory ");

        double entry1;
        double entry2;
        double total;
        System.out.println(" enter a number >>>>>>>>>>><> ");
        Scanner inputDevice = new Scanner(System.in);
        entry1 = inputDevice.nextDouble();
        System.out.println(" enter another number");
        entry2 = inputDevice.nextDouble();

        total = entry1 + entry2;
        System.out.println(entry1 +"+"+ entry2 +" = " + total);
        total = entry1 * entry2;
        System.out.println(entry1 +"*"+ entry2 +" = " + total);
        total = entry1 - entry2;
        System.out.println(entry1 +"-"+ entry2 +" = " + total);
        total = entry1 / entry2;
        System.out.println(entry1 +"/"+ entry2 +" = " + total);




    }
}
