package Day12June27;


import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // اولیاب
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int counter = 0;

        // A find the divisible number
        for (int number = num1; number < num2; number++) {
            boolean isPrime = true;
            int numberOfDivisor = 0;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // this number is divisible by i number
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(number);
                counter++;

            } else {

            }
        }
        if(counter == 0){
            System.out.println("0");
        }

    }
}