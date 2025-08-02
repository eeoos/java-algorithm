package algorithm.inflearn.s1;
import java.util.Scanner;
public class I0109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ca = sc.next().toCharArray();
		StringBuilder sb =new StringBuilder();
		for(char c : ca) {
			if (Character.isDigit(c)) sb.append(c); 
		}
		System.out.println(Integer.valueOf(sb.toString()));
	}

}
