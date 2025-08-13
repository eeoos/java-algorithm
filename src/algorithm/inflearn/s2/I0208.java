package algorithm.inflearn.s2;
import java.util.*;

public class I0208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<T; i++) {
			int e = sc.nextInt();
			l.add(e);
			l2.add(e);
		}
		
		Collections.sort(l2);
		Collections.reverse(l2);
		for(int i = 0; i<T; i++) {
			for(int j = 0; j<T; j++) {
				if(l.get(i) == l2.get(j)) {
					System.out.print((j+1) + " ");
					break;
				}
			}
		}
	}
}
