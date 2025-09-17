package algorithm.inflearn.s2;

import java.util.Scanner;

public class I0204_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int a = 1;
		int b = 1;
		
		System.out.print(a + " " + b + " ");
		for(int i = 2; i<T; i++) {
			int c = a+b;
			System.out.print(c + " ");
			a= b;
			b= c;
		}
		

	}

}
