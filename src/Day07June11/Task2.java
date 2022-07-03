package Day07June11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*Meysam wants to write a program using whole number, mention few feature of this number. The following are the feature
          if the number is divisible to 3 print the number is divisible by 3
           if the number is divisible to 5 print the number is divisible by 5
          if the number is divisible to 7 print the number is divisible by 7
           if the number is divisible to 15 print the number is divisible by 15
          if the number is divisible to 21 print the number is divisible by 21

          */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();

        if(n % 21 == 0) {
            System.out.println("the number is divisible by 21");

        } else if(n % 15 == 0) {
            System.out.println("the number is divisible by 15");

        } else if(n % 3 == 0 && n % 15 != 0 ) {
            System.out.println("the number is divisible by 3");

        } else if (n % 5 == 0 ) {
            System.out.println("the number is divisible by 5");

        } else if (n % 7 == 0) {
            System.out.println("the number is divisible by 7");

        } else {
            System.out.println("Check the number");

        }

    }
}


