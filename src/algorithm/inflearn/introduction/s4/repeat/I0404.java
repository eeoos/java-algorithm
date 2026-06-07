package algorithm.inflearn.introduction.s4.repeat;

import java.io.*;
import java.util.*;

public class I0404 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String t = br.readLine();
		
		I0404 T = new I0404();
		System.out.println(T.solution(s, t));
	}
	
	public int solution(String s, String t) {
		
		Map<Character, Integer> m1 = new HashMap<>();
		Map<Character, Integer> m2 = new HashMap<>();
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		for(int i = 0; i<c2.length; i++) m2.put(c2[i], m2.getOrDefault(c2[i], 0) + 1);
		for(int i = 0; i<c2.length-1; i++) m1.put(c1[i], m1.getOrDefault(c1[i], 0) + 1);
		
		int lt = 0, cnt = 0;
		for(int rt = c2.length-1; rt<c1.length; rt++) {
			m1.put(c1[rt], m1.getOrDefault(c1[rt], 0) + 1);
			
			if(m1.equals(m2)) cnt++;
			if(m1.get(c1[lt]) > 1) m1.put(c1[lt], m1.get(c1[lt]) - 1);
			else m1.remove(c1[lt]);
			
			lt++;
		}
		
		return cnt;
		
	}
}
