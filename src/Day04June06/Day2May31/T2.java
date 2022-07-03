package Day04June06.Day2May31;

import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
         /*
          exercise 2: get two double numbers from user and add them. this time you should use "nextDouble" method from scanner  and change the datatype as well
 */

        Scanner price = new Scanner(System.in);

        System.out.println("Please Enter two double number");

        double price1 = price.nextDouble();
        double price2 = price.nextDouble();

        System.out.println("Total price is : $" + (price1+price2));
    }
}
