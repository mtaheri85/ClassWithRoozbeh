package Day08June14;

import java.util.Scanner;

public class Task3 {
    public static void main(String [] args){

        /* Declare a hardcoded String

        if the input is L print the length of the Sting
        If the input is G print the Sting.
        if the input is I, get a int number from scanner and print the relevant char/character

        if the input is M, print the first half of the string ( use the sub.String method)

        Scanner.next.charAt(0)
        use the if or switch case*/

        Scanner input = new Scanner(System.in);
        String code = "book";
        char letter = input.next().charAt(0);

         switch (letter){
             case 'L':
                 System.out.println(code.length());
                 break;
             case 'G':
                 System.out.println(code);
                 break;
             case 'I':
                 int i = input.nextInt();
                 System.out.println(" The relevant Char is " + code.charAt(i));
                 break;
             case 'M':
                 int M;
                 M = code.length() / 2;
                 System.out.println(code.substring(0,M));
                 break;
             case'N':
                 M = code.length() / 2;
                 System.out.println(code.substring(M));


         }

    }
}
