package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		List<Character> list = new ArrayList<>();
		for(int i = input.length()-1; i>=0; i--) {
			char c = input.charAt(i);
			if(Character.isAlphabetic(c)) {
				list.add(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int index = 0;
		
		for(int i = 0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(Character.isAlphabetic(c)) {
				sb.append(list.get(index++));
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
