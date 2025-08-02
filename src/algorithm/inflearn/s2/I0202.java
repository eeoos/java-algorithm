package algorithm.inflearn.s2;
import java.util.*; 

public class I0202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		int a = 1;
		int cnt = 0;
		for(int i = 0; i<T; i++) {
			int b = sc.nextInt();
			if(b>a) {
				 cnt++;	 
			}
			a = (int)Math.max(a, b);
		}
		System.out.println(cnt);
	}

}
