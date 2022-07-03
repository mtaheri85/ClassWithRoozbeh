package Day07June11;

import java.util.Scanner;

public class Task4Switch {
    public static void main(String[] args) {

        /*Get a number from scanner */

        Scanner num = new Scanner(System.in);
        int input = num.nextInt();

        int r =  input % 3;

        switch (r){
            case 0:
            System.out.println("0");
            break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Wrong number");
        }


    }
}
