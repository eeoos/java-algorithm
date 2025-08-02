package algorithm.inflearn.s1;
import java.util.Scanner;

public class I0112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] sa = new String[T];
		
		for(int i = 0; i<T; i++) {
			int index = i*7;
			sa[i] = s.substring(index, index+7);
		}
		
		for(String t : sa) {
			int sum = 0;
			for(int i = 0; i<t.length(); i++) {
				if(t.charAt(i) == '#') {
					int digit = 6-i;
					sum += (int)Math.pow(2, digit);
				}
			}
			sb.append((char)sum);
		}
		System.out.println(sb.toString());
	}
}
