package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		int avg = sum / n;

		System.out.println("Sum is:" + sum);
		System.out.println("Average is:" + avg);

	}

}
