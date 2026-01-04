package algorithm.inflearn.s3;

import java.util.*;
public class I0301 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] aArr = new int[a];
		for(int i = 0; i<a; i++) {
			aArr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int[] bArr = new int[b];
		for(int i = 0; i<b; i++) {
			bArr[i] = sc.nextInt();
		}
		int c = a+b;
		int[] cArr = new int[c];
		for(int i = 0; i<c; i++) {
			if(i>=a) {
				cArr[i] = bArr[i-a];
			}else {
				cArr[i] = aArr[i];
			}
			 
		}
		
		Arrays.sort(cArr);
		
		for(int i = 0; i<c; i++) {
			System.out.print(cArr[i] + " ");
		}
		
	}

}
