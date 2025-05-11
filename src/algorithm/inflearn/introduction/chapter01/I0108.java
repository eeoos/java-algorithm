package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String input = sc.nextLine();
		
		for(int i = 0 ; i<input.length(); i++) {
			char c = input.charAt(i);
			if(Character.isAlphabetic(c)) {
				sb.append(c);
			}
		}
		
		if(sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
