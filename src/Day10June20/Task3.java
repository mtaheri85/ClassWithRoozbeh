package Day10June20;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
3- get a number from user (n) and print all numbers (i) which i%n == 2

(یک عدد از ورودی بگیرید و تمام اعداد که باقی مانده به ۳ آن ها برابر ۲ است را چاپ کنید.)
hint: you have two main ways for doing this, first one: like the previous question start from 2 and have a step=3
the other way is different, you can have a normal for which start from 1 and ends with n, then for every i (loop variable), you should check whenever i meets the above condition or not (with an "if" statement);
*/

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        /*for (int i = 2; i < number; i+=3) { // initialization should start from 0 or 1 or there is a logical reason for that
            System.out.println(i);
        }*/

        for (int i = 1; i < number; i++){
            if(i % 3 == 2) {
                System.out.println(i);
            }
        }

    }
}
