package algorithm.inflearn.s1;
import java.util.*;

public class I0107 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String input = sc.next();
		sb.append(input).reverse();
		String result = "";
		result = sb.toString().equalsIgnoreCase(input) ? "YES" : "NO";
		System.out.println(result);
	}

}
