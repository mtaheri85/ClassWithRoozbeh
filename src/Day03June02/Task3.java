package Day03June02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
          Task #3;

        Follow the Task 2 and the total value is greater (Z) value and make a substraction (25) to get A

        'X', 1 -> 'Y'
        'X', 3 -> 'A'
        'Z', 2 -> 'B'
         */
        System.out.println("Enter a letter in the Console:");
        Scanner scan = new Scanner(System.in);
        char letter = scan.next().charAt(0);
        System.out.println("Enter a number in the Console:");
        int number = scan.nextInt();

        int alphbetCount = 'Z' - 'A' + 1;

        int sum =(letter + number); // using the ASCII letter of (letter and number that is entered from cocnsule is added together

        System.out.println("asci value of " + sum);
        char letter2 = (char)sum;
        System.out.println("letter2 = " + letter2);

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a letter in the Console:");
        Scanner scan = new Scanner(System.in);
        char letter = scan.next().charAt(0);
        System.out.println("Enter a number in the Console:");
        int number = scan.nextInt();
        int alphbetCount = 'Z' - 'A' + 1;
        int sum =letter + number;
        //        start part2
        //A = 65 = 'A' + 0
        //B = 66 = 'A' + 1
        //Z = 90 = 'A' + 25
        int start = 'A';
        int part2 = sum - start; // chandomin harf e alphabet
        int part2Modified = part2 % alphbetCount; // 30%26 = 4

        sum = start + part2Modified;

        System.out.println("asci value of " + sum);
        char letter2 = (char) sum;
        System.out.println(letter2);
 */

    }
}
