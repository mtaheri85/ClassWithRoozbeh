package Day11June23;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*5- get a number from  the user and print such a triangle.
4
*
**
***
****
*/
       Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        for(int i = 0; i < number; i++) {
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();


        }
        }

    }


