package algorithm.inflearn.introduction.s4.repeat;

import java.io.*;
import java.util.*;

public class I0402 {
	public static void main(String[] args) throws IOException {
		
		I0402 T = new I0402();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 =  br.readLine();
		String s2 =  br.readLine();
		
		System.out.println(T.solution(s1, s2));
	}
	
	public String solution(String s1, String s2) {
		
		Map<Character, Integer> m = new HashMap<>();
		
		
		for(char c : s1.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0) + 1);
		}
		
		for(char c : s2.toCharArray()) {
			if(m.get(c) == null || m.get(c) == 0) {
				return "NO";
			}
			m.put(c, m.get(c) - 1);
		}
		
		return "YES";
	}
}
