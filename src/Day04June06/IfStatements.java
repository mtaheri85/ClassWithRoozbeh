package Day04June06;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // smaller
        int b = scan.nextInt(); // smaller
        int c = scan.nextInt();// largest

        if( (a+b) > c && (a+c) > b && (b+c) > a)
        {
            System.out.println(" Okay");
        }else{
            System.out.println(" Not okay ");
        }

    }
}
