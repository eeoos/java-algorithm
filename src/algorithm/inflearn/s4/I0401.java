package algorithm.inflearn.s4;

import java.util.*;
public class I0401 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		sc.nextLine();
		char[] cArr = sc.nextLine().toCharArray();
		
		int[] iArr = new int[5];
		
		for(int i = 0; i<T; i++) {
			iArr[cArr[i] - 65]++;
		}
		
		int max = -1;
		int index = 0;
		for(int i =0; i<5; i++) {
			if(iArr[i] > max) {
				max = iArr[i];
				index = i;
			}
		}
		
		System.out.println((char)(index + 65));
		
		
	}

}
