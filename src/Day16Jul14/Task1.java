package Day16Jul14;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*1- Concat 2 array:
Assuming that we have two arrays with the length of 5, 7. We want a third array with the size of 12 (5+7). The new array should contain all elements from array number 1 and array number 2.
for example:
array1: 1,2,3,4,5
array2: 10,11,12,13,14,15,16,17
result array: 1,2,3,4,5,10,11,12,13,14,15,16,17
hint: you should create a new array with the new size and copy elements from old arrays to new one in proper indices.
*/

        int [] arr1 = {1, 2, 3, 4, 5,};
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = {10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println(Arrays.toString(arr2));

        int [] arr4 = new int [arr1.length + arr2.length];

        int [] arr3 = new int [13];

        arr3 [0] = 1;
        arr3 [1] = 2;
        arr3 [2] = 3;
        arr3 [3] = 4;
        arr3 [4] = 5;
        arr3 [5] = 10;
        arr3 [6] = 11;
        arr3 [7] = 12;
        arr3 [8] = 13;
        arr3 [9] = 14;
        arr3 [10] = 15;
        arr3 [11] = 16;
        arr3 [12] = 17;



       // System.out.println(Arrays.toString(arr3));

        // Question: is there other way to give us the same result for the third array instead of assigning one number to each index?
    }
}
