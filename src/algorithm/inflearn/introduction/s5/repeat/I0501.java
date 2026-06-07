package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0501 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		I0501 T = new I0501();
		System.out.println(T.solution(s));
	}
	
	public String solution(String s) {
		
		String answer = "NO";
		Deque<Character> dq = new ArrayDeque<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') dq.push(c);
			else if(c == ')') {
				if(dq.isEmpty()) return answer; 
				dq.pop();
			}
		}
		
		return dq.isEmpty() ? "YES" : answer;
	}
}
