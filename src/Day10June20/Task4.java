package Day10June20;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*4- get 2 numbers from the user and draw a rectangle with given numbers.
this question is almost same as the one from the class, except that length of each row is not fixed, you should create line character by character instead.

for this purpose you may use "System.out.print" method instead of our good old "System.out.println". this new method would not go to next line after printing so that you can call this method multiple times for a single line.
for example:

System.out.print("*"); // this should be in a for loop
System.out.print("*");
System.out.print("*");
System.out.print("*");
System.out.println(); // go to the next line

example: for the given inputs (2 and 6) the result would be like this:
**
**
**
**
**
**
hint: we should use the "nested for". nested for is when we have a for in another for. (inner for and outer for. outer for is responsible for each line and inner for is responsible for each character of each line. note that after the inner for we should go to next line with a println
*/
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for(int i = 0; i < n1; i++) { // outer loop

            for(int j = 0; j <n2; j++){ // inner loop
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
