package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0101 {
	public static void main(String[] args) throws IOException {
		I0101 T = new I0101();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		
		System.out.println(T.solution(s, t));
		System.out.println(T.solution2(s, t));
	}
	
	public int solution(String s, String t) {
		int cnt = 0;
		char a = t.toUpperCase().charAt(0);
		for(char c : s.toUpperCase().toCharArray()) {
			if(a == c) cnt++;
		}
		
		return cnt;
	}
	
	public int solution2(String s, String t) {
		char a = t.toUpperCase().charAt(0);
		int cnt = 0;
		for(char c : s.toCharArray()) {
			if(Character.toUpperCase(c) == a) cnt++;
		}
		return cnt;
	}
}
