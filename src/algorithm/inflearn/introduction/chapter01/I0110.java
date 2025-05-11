package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String i1 = sc.next();
		String i2 = sc.next();
		
		List<Integer> indexList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		for(int i = 0; i<i1.length(); i++) {
			char c = i1.charAt(i);
			if(String.valueOf(c).equals(i2)) {
				indexList.add(i);
			}
		}
		
		for(int i = 0; i<i1.length(); i++) {
			char c = i1.charAt(i);
			int min = Math.abs(indexList.get(0) - i);
			for(int j = 0; j<indexList.size(); j++) {
				int tmp = Math.abs(indexList.get(j) - i);
				min = min > tmp ? tmp : min;
			}
			list.add(String.valueOf(min));
		}
		System.out.println(String.join(" ", list));

	}

}
