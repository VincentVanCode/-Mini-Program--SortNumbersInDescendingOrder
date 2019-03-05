package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
//    public static void bubble_sort(int array[]){
//        int n = array.length;
//        int k;
//        for (int m = n; m >= 0; m--) {
//            for (int i = 0; i < n -1 ; i++) {
//                k = i + 1;
//                if (array[i] > array[k]){
//
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
         int[] arrayUnsorted = new int[3];
         int length = arrayUnsorted.length;
            for (int i = 0; i < length; i++) {
                arrayUnsorted[i] = scanner.nextInt();
            }
            //int[] arraySorted = new int[arrayUnsorted.length];
            Arrays.sort(arrayUnsorted);
        for (int i = length -1; i >= 0 ; i--) {
            System.out.printf("%d%n", arrayUnsorted[i]);
        }




    }
}
