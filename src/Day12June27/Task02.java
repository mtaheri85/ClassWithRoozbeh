package Day12June27;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // دو لوزی

        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if (i <= number / 2) {
                for (int k = 0; k < number -i - (number / 2 ); k++){
                    System.out.print(" ");
            }
                // put for for white space, we can use similar for but some changes to the logic
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // put for for white space, we can use similar for but some changes to the logic
                for( int l = 0; l < i - number/2 ; l++ ){
                    System.out.print(" ");
                }
                for (int j = 0; j < (number - i) * 2 - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
