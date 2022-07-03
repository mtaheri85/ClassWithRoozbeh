package Day07June11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        double H = input.nextDouble();

        if (w > 30 && H > 60) {
            System.out.println("Obesity");
        } else if (w >= 18.5 && H >=5.25) {
            System.out.println("Normal weight");
        } else if(w >= 25 && H>=30 ){
            System.out.println("Over Weight");
        } else if (w <= 0 && H <=18.5 ) {
            System.out.println("Under Weight");

        }

    }
}
