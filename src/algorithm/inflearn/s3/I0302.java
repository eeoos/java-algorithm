package algorithm.inflearn.s3;

import java.util.*;
public class I0302 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		
		int a = sc.nextInt();
		int[] aArr = new int[a];
		for(int i = 0; i<a; i++) {
			aArr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		for(int i = 0; i<b; i++) {
			int tmp = sc.nextInt();
			
			for(int k =0; k<a; k++) {
					if(aArr[k] == tmp) l.add(aArr[k]);
			}
		}
		
		Collections.sort(l);
		
		for(int i = 0; i<l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
	}

}
