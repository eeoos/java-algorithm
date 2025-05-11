package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String input = sc.next();
		
		for(int i = 0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(Character.isDigit(c)) {
				sb.append(c);
			}
		}
		
		System.out.println(Integer.parseInt(sb.toString()));

	}

}
