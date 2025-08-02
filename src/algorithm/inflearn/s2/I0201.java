package algorithm.inflearn.s2;
import java.util.*;

public class I0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
			
		int T = sc.nextInt();
		sc.nextLine();
		for(String s :sc.nextLine().split(" ")) {
			int tmp = Integer.parseInt(s);
			if(T <= tmp) list.add(s); 
		}
		System.out.println(String.join(" ", list));
	}
}
