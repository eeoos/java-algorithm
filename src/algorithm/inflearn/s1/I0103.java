package algorithm.inflearn.s1;
import java.util.Scanner;

public class I0103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sa = sc.nextLine().split(" ");
		String result = "";
		for(String s : sa) {
			result = s.length()> result.length() ? s : result; 
		}
		System.out.println(result);
	}

}
