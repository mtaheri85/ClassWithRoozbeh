package Day10June20;

import java.util.Scanner;

public class Task2EvenNumber {
    public static void main(String[] args) {

        /*
        * 2- get a number from the user and print all even (زوج) numbers between 1 and the number. for example for the input of 10, the answer should be:
2
4
6
8
10

hint: you can declare a "for" which start from 2 and have the step of "2".
*/

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i <= number; i+=2) {
            System.out.println(i); // i doesn't change here and all the changes should be made in for
        }
    }
}
