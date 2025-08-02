package algorithm.inflearn.s1;
import java.util.*;

public class I0108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] ca = sc.nextLine().toCharArray();
		
		for(char c : ca) if(Character.isAlphabetic(c)) sb.append(c);
		
		String result = "";
		result = sb.toString().equalsIgnoreCase(sb.reverse().toString()) ? "YES" : "NO";
		System.out.println(result);
	}

}
