package algorithm.inflearn.s1;
import java.util.*;

public class I0102 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] ca = sc.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : ca) {
			sb.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
		}
		System.out.println(sb.toString());
		
	}

}
