package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<T; i++) {
			sb.setLength(0);
			String input = sc.next();
			sb.append(input);
			sb.reverse();
			System.out.println(sb.toString());
		}
 	}
}
