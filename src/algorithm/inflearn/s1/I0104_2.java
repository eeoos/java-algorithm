package algorithm.inflearn.s1;
import java.util.Scanner;

public class I0104_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			char[] cArr= sc.next().toCharArray();
			int lt = 0;
			int rt = cArr.length-1;
		
			while(lt < rt) {
				char tmp = cArr[lt];
				cArr[lt] = cArr[rt];
				cArr[rt] = tmp;
				lt++;
				rt--;
			}
			System.out.println(String.valueOf(cArr));
		}
		
	
	}

}
