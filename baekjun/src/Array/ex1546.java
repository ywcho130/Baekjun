package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int[N];
		int max = 0;
		int sum = 0;
		for(int i =0; i<N; i++) {
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		max = arr[N-1];
		for(int i =0; i<N; i++) {
			sum += arr[i];
		}
		System.out.println(sum*100.0/max/N);
	}

}
