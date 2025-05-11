package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<input.length(); i++) {
			String tmp = sb.toString();
			char c = input.charAt(i);
			if(!tmp.contains(String.valueOf(c))) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

	}

}
