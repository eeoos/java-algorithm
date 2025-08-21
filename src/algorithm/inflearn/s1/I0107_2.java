package algorithm.inflearn.s1;
import java.util.*;

public class I0107_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[]  ca = sc.next().toUpperCase().toCharArray();
		String answer = "YES";
		
		for(int i = 0; i<ca.length/2; i++) {
			if(ca[i] != ca[ca.length-i-1]) {
				answer = "NO";
				break; 
			}
		}
		
		System.out.println(answer);
	}

}
