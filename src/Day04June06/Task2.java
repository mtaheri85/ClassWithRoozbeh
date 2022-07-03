package Day04June06;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
      //  int c = scan.nextInt(); got another int from scanner

        int max,min;

        if(a>b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println(max);
        System.out.println(min);

        // get another number form scanner and find the min and the max of these three numbers.

        // have to have three if


    }


}
