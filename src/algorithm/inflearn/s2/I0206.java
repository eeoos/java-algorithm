package algorithm.inflearn.s2;

import java.util.*;
public class I0206 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> result = new ArrayList<>();
		
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int input = sc.nextInt();
			int rvs = 0;
			
			while(input > 0) {
				rvs = (rvs * 10) + input%10;
				input /= 10;
			}
			
			if(rvs == 1) continue;
			boolean b = true;
			for(int j = 2;j<rvs; j++) {
				if(rvs%j == 0) {
					b = false;
					break;
				}
			}
			if(b) result.add(rvs);
		}
		
		for(int i =0; i<result.size(); i++) {
			System.out.print(result.get(i) + " ");			
		}
	}

}
