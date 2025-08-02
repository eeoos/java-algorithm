package algorithm.inflearn.s1;
import java.util.*;

public class I0110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] sa = sc.next().split("");
		String s = sc.next();
		List<Integer> il = new ArrayList<>();
		String[] result = new String[sa.length];
		
		List<Integer> index = new ArrayList<>();
		for(int i = 0; i<sa.length; i++) {
			if(sa[i].equals(s)) index.add(i);
		}
		
		for(int i = 0; i<sa.length; i++) {
			int min = 101;
			for(int j = 0; j < index.size(); j++) {
				min = Math.min(min, Math.abs(i-index.get(j)));
			}
			result[i] = String.valueOf(min);
		}
		System.out.println(String.join(" ", result));
	}
}
