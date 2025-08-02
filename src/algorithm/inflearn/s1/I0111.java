package algorithm.inflearn.s1;
import java.util.Scanner;

public class I0111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String[] sa = sc.next().split("");
		String s = sa[0];
		int cnt = 0;
		
		for(String t : sa) {
			if(t.equals(s)) {
				cnt++;
			}else {
				sb.append(s);
				if(cnt > 1) sb.append(cnt);
				s = t;
				cnt = 1;
			}
		}
		sb.append(s);
		if(cnt > 1) sb.append(cnt);
		System.out.println(sb.toString());
	}

}
