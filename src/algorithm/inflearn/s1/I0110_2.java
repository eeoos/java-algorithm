package algorithm.inflearn.s1;
import java.util.Scanner; 

public class I0110_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] ca = sc.next().toCharArray();
		char c = sc.next().charAt(0);
		int[] ia = new int[ca.length];
		
		int cnt= 1000;
		
		for(int i = 0; i<ca.length; i++) {
			if(ca[i] == c) {
				cnt = 0;
				ia[i] = cnt;
			}else {
				cnt++;
				ia[i] = cnt;
			}
		}
		
		for(int i = ca.length-1; i>=0; i--) {
			if(ca[i] == c) {
				cnt = 0;
			}else {
				cnt++;
				ia[i] = Math.min(ia[i], cnt);
			}
		}
		
		for(int i = 0; i<ca.length; i++) {
			System.out.print(ia[i] + " ");
		}
	}

}
