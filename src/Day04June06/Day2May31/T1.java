package Day04June06.Day2May31;

import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {

        /*
        get 2 input integer from user with scanner
        and then print their sum
        you should use nextInt method from scanner


 */
                Scanner number = new Scanner(System.in);

                System.out.println("Please Enter two Integer number");

                int numb1 = number.nextInt();
                int numb2 = number.nextInt();

                System.out.println("The total number is:" + (numb1+numb2));
    }
}
