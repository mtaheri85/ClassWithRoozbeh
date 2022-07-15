package Day16Jul14;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public  static void main(String[] args){
        /*2- search in an array:
Get 10 numbers from the user and store them in an array, then get a number named "element".
iterate through the array and check if "any" of elements in the array is equal to "element" or not. if yes print "yes" and otherwise print "no"
*/
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int [] arr1 = new int [number];
        System.out.println(Arrays.toString(arr1));

        int [] element = new int [2];

        for (int i = 0; i < arr1.length; i++){
            int element1 = arr1[i];
            System.out.print(Arrays.toString(element));
        }



        }

    }