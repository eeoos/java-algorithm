package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		List<String> list = new ArrayList<>();
		int max = -1;
		String[] inputArr = input.split(" ");
		for(int i = 0; i<inputArr.length; i++) {
			max = max <inputArr[i].length() ? inputArr[i].length() : max;
		}
		
		for(String s : inputArr) {
			if(s.length() == max) {
				list.add(s);
			}
		}
		System.out.println(list.get(0));
	
 	}

}
