package Day08June14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double W = input.nextDouble();
        double H = input.nextDouble();

        double BMI = W/(H*H);

        if(BMI < 0){
            System.out.println("Error, the weight couldn't be negative");
            //return;
        }

         else if (BMI <18.5 ) {
            System.out.println("Under Weight");
        } else if ( BMI <25) {
            System.out.println("Normal weight");
        } else if(BMI <30 ){
            System.out.println("Over Weight");
        } else if (BMI >= 30 ) { // we can add this instead of leaving empty && BMI < Double.MAX_VALUE
            System.out.println("Obesity");

        }
        /*BMI range Output
[0,18.5) Under weight
[18.5,25) Normal weight
[25,30) Over weight
[30,+inf) Obesity*/

    }
}
