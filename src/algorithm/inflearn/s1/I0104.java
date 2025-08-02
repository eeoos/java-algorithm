package algorithm.inflearn.s1;
import java.util.Scanner;

public class I0104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			sb.setLength(0);
			System.out.println(sb.append(sc.next()).reverse());
		}
	}
}
