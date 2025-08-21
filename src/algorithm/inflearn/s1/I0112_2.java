package algorithm.inflearn.s1;
import java.util.*;
public class I0112_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<T; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			char c = (char)Integer.parseInt(tmp, 2);
			sb.append(c);
			s = s.substring(7);
		}
		
		System.out.println(sb.toString());
		
	}

}
