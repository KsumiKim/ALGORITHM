package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinPossibleValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			B[i] = in.nextInt();
		}
		
		Arrays.sort(A);
		
		List<int[]> list = new ArrayList<>();
		
		for (int i = 0; i < B.length; i++) {
			list.add(new int[] {i, B[i]});
		}
		Collections.sort(list, (a, b) -> b[1] - a[1]);
		
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i] * list.get(i)[1];
		}
		System.out.println(sum);
	}
}
