package algorithm.inflearn.introduction.chapter01;

import java.util.*;

public class I0102 {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char[] input= sc.next().toCharArray();
			StringBuilder sb = new StringBuilder();
			for(char i : input) {
				char tmp = Character.isLowerCase(i) ? Character.toUpperCase(i) : Character.toLowerCase(i);
				sb.append(tmp);
			}
			System.out.println(sb.toString());

			
	 	}
}
