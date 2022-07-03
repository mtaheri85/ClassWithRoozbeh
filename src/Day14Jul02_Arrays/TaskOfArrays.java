package Day14Jul02_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaskOfArrays {
    public static void main(String[] args) {
         /*
        Get a number from Scanner and create an Array according to the entered number
        The first part of the Array should be given numbers from 0 up to half of the entered
        number
        The second half of the Array should be -1 ( the rest of the indices)
        Finally, print the entire array

        How to print;
        One time with for loop
               - the print should be like  (0,1,2,3,4,-1.-1) and there should be a (,) between
               numbers.
               - note, there should not be (,) after the last element.
        Second time with Arrays.toString
        if you cannot to any part of the task, complete the rest of them.
        * */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int [] arr1 = new int [number];

        for( int i = 0 ; i<number/2; i++){
            arr1 [i] = i;
        }
        for(int j = number/2; j<number; j++){
            arr1 [j] = -1;
         }
        if (number % 2 == 1){
          int a = number/2;
          arr1 [a] = 12;
        }
       System.out.println(Arrays.toString(arr1));

        for( int i = 0; i < number; i++){
            if ( i==0) {
                System.out.print(arr1[i]);
            } else{
                System.out.print(", " + arr1[i]);
            }
        }
        System.out.println();
    }
}
