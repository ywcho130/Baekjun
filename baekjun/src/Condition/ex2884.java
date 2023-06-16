package Condition;

import java.util.Scanner;

public class ex2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y = sc.nextInt();
		if (x==0&&y<45) {
			System.out.println(23);
			System.out.println(y+15);
		}else if (x==0&&y>45){
			System.out.println(x);
			System.out.println(y-45);
		}else if (x>0&&y>45) {
			System.out.println(x);
			System.out.println(y-45);
		}else if (x>0&&y<45) {
			System.out.println(x-1);
			System.out.println(y+15);
		}
	}

}
