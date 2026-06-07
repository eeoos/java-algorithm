package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;
import java.util.*;

public class I0106 {
	public static void main(String[] args) throws IOException {
		I0106 T = new I0106();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution(s));
	}
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == i) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public String solution2(String s) {
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c : s.toCharArray()) {
			set.add(c);
		}
		
		for(char c : set) {
			sb.append(c);
		}
		
		return sb.toString();
	}
}
