package algorithm.inflearn.s1;
import java.util.*;

public class I0106_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		for(int i = 0; i<s.length(); i++) {
			if(i == s.indexOf(s.charAt(i))) sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
