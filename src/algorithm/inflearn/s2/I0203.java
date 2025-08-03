package algorithm.inflearn.s2;
import java.util.*;

public class I0203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String[] aa = sc.nextLine().split(" ");
		String[] ba = sc.nextLine().split(" ");
		
		
		for(int i = 0; i<aa.length; i++) {
			int a = Integer.parseInt(aa[i]);
			int b = Integer.parseInt(ba[i]);
			
			int result = a- b;
			if(result == 0) sb.append("D").append("\n");
			else if(result == -2 || result == 1) sb.append("A").append("\n");
			else sb.append("B").append("\n");
			
		}
		System.out.println(sb.toString());
	}
}
