package algorithm.inflearn.introduction.s3;

import java.util.*;
public class I0301 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> l = new ArrayList<>();
		
		int a = sc.nextInt();
		for(int i = 0; i<a; i++) {
			l.add(sc.nextInt());
		}
		
		int b = sc.nextInt();
		for(int i = 0; i<b; i++) {
			l.add(sc.nextInt());
		}
		
		Collections.sort(l);
		
		for(int i = 0; i<l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		
	}

}
