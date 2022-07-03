package Day03June02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        Task #2:

        Step 1) Get a character from scanner (search the type of method that will be used for this task)
        Step 2) print the ASCII code of this character, get a (n) character from scanner.
        Step 3) add the ASCII code with n's value/number,
        Step 4) convert it character again.

        A = 65
        n = 1

        A+n = 66
        B = 66 ( this is the ASCII number of B)

         */

        System.out.println("Enter a letter in the Console:");

        Scanner scan = new Scanner(System.in);

        char letter = scan.next().charAt(0);

        System.out.println("Enter a number in the Console:");

        int number = scan.nextInt();

        int sum =(letter + number); // using the ASCII letter of (letter and number that is entered from cocnsule is added together

        System.out.println("asci value of " + sum);

        char letter2 = (char)sum;

        System.out.println("letter2 = " + letter2);




    }
}
