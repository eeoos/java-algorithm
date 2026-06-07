package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;
import java.util.*;

public class I0105 {
	public static void main(String[] args) throws IOException {
		I0105 T = new I0105();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution(s));
		System.out.println(T.solution2(s));
	}
	
	public String solution(String s) {
		char[] arr = s.toCharArray();
		Deque<Character> dq = new ArrayDeque<>();
		for(char c : arr) {
			if(Character.isAlphabetic(c)) {
				dq.push(c);
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				arr[i] = dq.pop();
			}
		}
		
		return String.valueOf(arr);
	}
	
	public String solution2(String s) {
		char[] arr = s.toCharArray();
		int lt = 0, rt = arr.length-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(arr[lt])) lt++;
			else if(!Character.isAlphabetic(arr[rt])) rt--;
			else {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				
				lt++;
				rt--;
			}
		}
		
		return String.valueOf(arr);
	}
}
