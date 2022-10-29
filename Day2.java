package Codigtutor;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;

public class Day2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
//4,5
		int n; n = sc.nextInt();
		int[] F = new int[n + 1];
		F[0] = 0; F[1] = 1;
		for (int i = 2; i < F.length; i++) {
			F[i] = F[i-2] + F[i-1];
		}
		System.out.println(F[n]);
		
		
		
		
		

//		/3.1
//		 *  System.out.println("Enter elements of array");
//		 */
//		int[] array = new int[] { 7, 5, 4, 6, 7, 9 };
//
////		for (int i = 0; i < array.length; i++) {
////			array[i] = sc.nextInt();
////		}
//
//		int[] arrCount = new int[100000];
//		for (int i = 0; i < array.length; i++) {
//			arrCount[array[i]]++;
//		}
//		for (int i = 0; i < array.length; i++) {
//			if (arrCount[array[i]] != 0) {
//				System.out.println(array[i] + " has " + arrCount[array[i]] + " elements.");
//				arrCount[array[i]] = 0;
//			}
//		}
//		// 5 7 4 6 9
//
////		Arrays.sort(array);
////		for (int a : array) {
////			System.out.println(a);
////
////		}
////		int[] b = new int[array.length];
////		for (int i = array.length - 1; i >= 0; i--) {
////			b[array.length - i - 1] = array[i];
////			System.out.println(b[array.length - i - 1]);
////			
////		}
//		int max = 0;
//		int min = 1000000;
//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) {
//				max = array[i];			
//			}
//			
//			if (min > array[i]) {
//				min = array[i];
//			}
//		}
//		System.out.println("Max number is " + max);
//		System.out.println("Min number is " + min);
		
	}

}
