package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer [] arr= new Integer [N];
		for(int i=0; i<N; i++) {
			arr [i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
	}

}
