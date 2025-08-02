package algorithm.inflearn.s1;
import java.util.*;

public class I0106 {

	public static void main(String[] args) {
		Set<String> cs = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);
		
		String[] sa =  sc.next().split("");
		for(String c : sa) cs.add(c);
		System.out.println(String.join("", cs));
	}
}
