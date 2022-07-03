package Day07June11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Write a program to get two number from scanner
         if the first number is divisible to second number and at least one of the is even, the answer should be Yes, otherwise No
        */

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if (n1 % n2 == 0 && (n2 % 2 == 0 || n1 % 2 == 0)) {

            System.out.println("Yes");

        } else {
            System.out.println("No");

        }
    }

    }

