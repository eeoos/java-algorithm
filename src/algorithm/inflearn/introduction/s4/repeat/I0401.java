package algorithm.inflearn.introduction.s4.repeat;

import java.io.*;
import java.util.*;

public class I0401 {
	public static void main(String[] args) throws IOException {
		
		I0401 T = new I0401();
		
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		System.out.println(T.solution(n, s));
	}
	
	public char solution(int n, String s) {
		
		
		Map<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) +1); 
		}
		
		int max = Integer.MIN_VALUE;
		char result = ' ';
		
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			if(e.getValue() > max) {
				max = e.getValue();
				result = e.getKey();
			}
		}
		
		return result;
	}
}
