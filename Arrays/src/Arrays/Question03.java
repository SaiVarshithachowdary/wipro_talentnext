package Arrays;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int target = sc.nextInt();
		boolean found = true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				System.out.println(i + " ");
				found = false;

			}
		}

		if (found) {
			System.out.println("-1");
		}
	}
}