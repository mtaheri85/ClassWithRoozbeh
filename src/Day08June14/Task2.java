package Day08June14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        Get a string from scanner user scanner.nextLine
        Get a number from scanner which is the index number of the above String
        check if the index number is in the String or not
        if the index number is not valid, print error.
        If the index number is valid, print the relevant index
       */

        // To enter data in consule we use scanner method
        Scanner scan = new Scanner(System.in);

        // Get a string from scanner user scanner.nextLine
        // Get a number from scanner which is the index number of the above String

        String text = scan.nextLine().trim(); // other name if trim is Strip and Trimwhitespace
        int number = scan.nextInt();

        System.out.println("length of entered text is = " + text.length()); // to get the length of the String I created print statement
        System.out.println("Entered number is = " + number);

        // check if the index number is in the String or not
        // if the index number is not valid, print error.
      if ( number >= text.length() || number <0){
          System.out.println("Error");
      }else{
          System.out.println(" Relevant Index is " + text.charAt(number));

      }

    }
}
