package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0505 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		I0505 T = new I0505();
		System.out.println(T.solution(s));
		
	}
	
	public int solution(String s) {
		Deque<Character> dq = new ArrayDeque<>();
		char[] arr = s.toCharArray();
		int cnt = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == '(') dq.push('(');
			else {
				dq.pop();
				if(arr[i-1] == '(') cnt += dq.size();
				else cnt++;
			}
		}
		
		return cnt;
	}
}
