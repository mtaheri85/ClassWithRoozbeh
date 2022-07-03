package Day05June09;

import java.util.Scanner;

public class Task1_fromPreviousClass {
    public static void main(String[] args) {

        // or
        System.out.println(((true&& true)||true)); // true
        System.out.println(((true||true)||false)); // ture
        System.out.println (((true || false) || false )); // ture
        System.out.println((false &&  true) && true); // false

        System.out.println("---------------------------------------");
        // and
        System.out.println(((true||true)||true)); // true
        System.out.println(((true||true)||false)); // ture
        System.out.println (((true || false) || false )); // ture
        System.out.println((false || false) || false); // false
        System.out.println("---------------------------------------");

        // xor if EXACTLY one of them is true.
        System.out.println("Test");
        System.out.println((true^true)^false); // why this one is false?
        System.out.println((true^false)^ true);
        System.out.println((false^ true)^false);
        System.out.println((true^true)^false);
        System.out.println((true^true)^true);

        System.out.println("---------------------------------------");

        // mix of operators
        System.out.println((true||true)&&false);
        System.out.println((true^false)|| true);
        System.out.println((false&& true)||false);
        System.out.println((true||true)||false);

        System.out.println(false ^ false);
        System.out.println(true ^ false);


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
      int c = scan.nextInt();

        int max = 1 ,min = 1;

            // false ture = false
        if(a>=b && a>=c) {
            max = a;

            //    false   ture = false
        } else if (b>=a && b>=c){
            max =  b;

        }else {
           max = c;
        }
//             check the number 445, 554 and 555
            if(a<=b && a<=c){
                min = a;
            }
            else if(b<=a && b<=c){
                min = b;
            }
            else if (c<=a && c<=b){
                min =c;
            }
            else {
                System.out.println("Error");
            }
        System.out.println("Max" + max);
        System.out.println("Min" + min);


        // get another number form scanner and find the min and the max of these three numbers.

        // have to have three if





    }


}
