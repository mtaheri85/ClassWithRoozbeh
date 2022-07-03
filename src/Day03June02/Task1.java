package Day03June02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Enter three number
        calculate number one plus number two, total value multiple to number three,
        number one plus two and divided number three

        No explicit casting Byte -> short -> int -> long -> float -> double.
        result should be a float/double number

        hint - get the integer get from scanner with nextDouble method or implicit cast from int to double.
         */

        Scanner number = new Scanner(System.in);

        System.out.println("Enter three number");

        double  num1 = number.nextDouble();
        double  num2 = number.nextDouble();
        double num3 = number.nextDouble();

        System.out.println("The Final Number for the first requirement is:" +  + ((num1+num2) * num3) + "\nThe Final Number for the second requirement is:" + ((num1 + num2) / num3));

    }
}
