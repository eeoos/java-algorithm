package algorithm.inflearn.s1;
import java.util.*;

public class I0105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Character> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		char[] ca = sc.next().toCharArray();
		
		
		for(int i = ca.length-1; i>=0; i--) {
			char c = ca[i];
			if(Character.isAlphabetic(c)) list.add(c);
		}
		int j = 0;
		for(char c : ca) {
			if(Character.isAlphabetic(c)) {
				sb.append(list.get(j++));
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
