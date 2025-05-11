package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(input);
		
		if(input.equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
