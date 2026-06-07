package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0507 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String t = br.readLine();
		String s = br.readLine();
		
		
		I0507 T = new I0507();
		System.out.println(T.solution2(t, s));
		
	}
	
	public String solution(String t, String s) {
		
		Deque<Character> dq = new ArrayDeque<>();
		for(char c : t.toCharArray()) dq.offer(c);
		
		for(char c: s.toCharArray()) {
			if(dq.isEmpty()) return "YES";
			if(dq.peek() == c) dq.poll();
		}
		
		if(dq.isEmpty()) return "YES";
		return "NO";
	}
	
	public String solution2(String t, String s) {
		
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(t.indexOf(c) != -1) sb.append(c);
		}
		
		return sb.toString().startsWith(t) ? "YES" : "NO";
	}
}
