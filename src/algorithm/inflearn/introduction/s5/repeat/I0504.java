package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0504 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		I0504 T = new I0504();
		System.out.println(T.solution(s));
	}
	
	public int solution(String s) {
		Deque<Integer> dq = new ArrayDeque<>();
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c)) dq.push((int)(c-'0'));
			else {
				int a = dq.pop();
				int b = dq.pop();
				if(c == '+') {
					dq.push(b+a);
				} else if(c == '-') {
					dq.push(b-a);
				}else if(c == '*') {
					dq.push(b*a);
				}else {
					dq.push(b/a);
				}
			}
		}
		
		return dq.pop();
	}
}
