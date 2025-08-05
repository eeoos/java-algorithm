package algorithm.inflearn.s2;
import java.util.Scanner;

public class I0204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] sa = new int[T];
		
		sa[0] = sa[1] = 1;
		
		for(int i = 2; i<T; i++) {
			sa[i] = sa[i-1] + sa[i-2];		
		}
		
		for(int i : sa) {
			System.out.print(i + " ");
		}
	}
}
