package HW8;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;

public class Fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n; n = sc.nextInt();
		int[] F = new int[n + 1];
		F[0] = 0; F[1] = 1;
		for (int i = 2; i < F.length; i++) { //O(n)? 
			F[i] = F[i-2] + F[i-1];
		}
		System.out.println(F[n]);
	}
}
