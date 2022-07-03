package Day10June20;

import java.util.Scanner;

public class Task1PrimeNumber {
    public static void main(String[] args) {

        /*
        *1- get a number from the user and check if the number is prime or not.
عدد اول = prime number
a number is prime when it is only divisible by 1 and itself.
hint: create a for loop from 1 to the number, count divisors. after the loop, create an "if" on the number of divisors, if the number of divisors is exactly 2, the number is a prime number.
another hint: https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not/
*/
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        if (number == 1) {
            System.out.println(" The nubmer is not prime");
        } else {
            boolean isPrime = true;

            int numberOfDivisor = 0;
            for (int i = 2; i < number; i++) {

                if (number % i == 0) { // this number is divisible by i number
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { // we can write as (isPrime == true) as well
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }
}

