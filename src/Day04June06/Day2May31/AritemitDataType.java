package Day04June06.Day2May31;

import java.util.Scanner;

public class AritemitDataType {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numb = input.nextInt();
        int numb2 = input.nextInt();

        System.out.println( numb + numb2);
        System.out.println(numb * numb2);
        System.out.println(numb - numb2);
        System.out.println(numb / numb2);

        double name = (numb / (double) numb2) + 2;

        name = name * name;
        System.out.println(name);

    }

}


/*
       //c = !c;
        boolean nc = !c;
        System.out.println("c after not : "+ nc);

                // AND: if both of them are true
                System.out.println("false and false" + (false&&false)); // false
                System.out.println("true and false: " + (c&&b)); // false
                System.out.println("true and  true: " + (b&&b)); // true
                // OR: if at least one of them is true
                System.out.println("false or false: " + (false||false)); // false
                System.out.println("true  or false: " + (c||b)); // true
                System.out.println("true  or  true: " + (b||b)); // true
                // XOR: if EXACTLY one of them is true
                System.out.println("false XOR false" + (false^false)); // false
                System.out.println("false XOR  true" + (false^true)); // true
                System.out.println("true  XOR  true" + (true^true)); // false
*/