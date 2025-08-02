package algorithm.inflearn.s1;
import java.util.*;

public class I0101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String i1 = sc.nextLine();
		String i2 = sc.nextLine();
		int cnt = 0;
		for(int i = 0; i<i1.length(); i++) {
			if(String.valueOf(i1.charAt(i)).equalsIgnoreCase(i2)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
