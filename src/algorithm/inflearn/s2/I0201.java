package algorithm.inflearn.s2;
import java.util.*;

public class I0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
			
		int T = sc.nextInt();
		sc.nextLine();
		int tmp = sc.nextInt();
		list.add(tmp);
		for(int i = 0; i<T-1; i++) {
			int a = sc.nextInt();
			if (tmp < a) list.add(a);
			tmp = a;
		}
		
		
		for(Integer r : list) {
			System.out.print(r + " ");
		}
	}
}
