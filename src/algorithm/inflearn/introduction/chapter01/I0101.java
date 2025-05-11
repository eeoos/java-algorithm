package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i1 = sc.next().toLowerCase();
		String i2 = sc.next().toLowerCase();
		
		int result = 0;
		for(int i = 0; i<i1.length(); i++) {
			String tmp = String.valueOf(i1.charAt(i));
			if(i2.equals(tmp)) {
				result++;
			}
		}
		System.out.println(result);
	}

}
