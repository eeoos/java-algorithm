package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0502 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		I0502 T = new I0502();
		System.out.println(T.solution(s));
	}
	
	public String solution(String s) {
		
		StringBuilder sb = new StringBuilder();
		Deque<Character> dq = new ArrayDeque<>();
		
		for(char c : s.toCharArray()) {
			if(c == ')') while(dq.pop() != '(');
			else dq.push(c);
		}
		
		int size = dq.size();
		for(int i = 0; i<size; i++) {
			sb.append(dq.pollLast());
		}
		
		return sb.toString();
	}
}
