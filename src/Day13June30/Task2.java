package Day13June30;

import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int arr[] = new int[10];
            int arr2[] = new int[10];
            for (int i = 0; i < 10; i++) {
                arr2[i] = arr[i];
            }

            arr2 = arr;

            arr[1] = 1;
            arr2[1] = 2;

            System.out.println(arr[1]); // 1
            System.out.println(arr2[1]); // 2


            int a = 20;
            int b = a;

            a = 1;
            b = 2;
            System.out.println(a); // 1
            System.out.println(b); // 2

        }

    }

