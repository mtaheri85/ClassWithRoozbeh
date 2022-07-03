package Day11June23;

import java.util.Scanner;
public class Task03 {

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        int multiDigit = input.nextInt();
        int multiDigit1 = multiDigit;

        // count the number of digits
        int count = 0;
        while (multiDigit !=0) {//                  1,          2 ,             3
            multiDigit = multiDigit / 10;  // 123 / 10 => 12, 12 / 10 = 1, 1 / 10 =0
            count++;
        }


        int reverse = 0; // reversing the number  for additional info please check this link: https://www.javatpoint.com/how-to-reverse-a-number-in-java
        for(int i = 0; i< count; i++){
            int digit = multiDigit1 % 10;
            multiDigit1 = multiDigit1 / 10;
              reverse = reverse * 10 + digit;
        }

        multiDigit1 = reverse;
        for(int j = 0 ;j < count; j++) {
            int number = multiDigit1 % 10;
            multiDigit1 = multiDigit1 / 10;

            System.out.print(number + ": ");
            for (int i = 0; i < number; i++) {
                System.out.print(number);
            }
            System.out.println();
        }

    }
}
