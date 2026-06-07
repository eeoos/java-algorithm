package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0102 {
	public static void main(String[] args) throws IOException {
		I0102 T = new I0102();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution(s));
	}
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			char tmp = Character.isUpperCase(c) ? Character.toLowerCase(c) :Character.toUpperCase(c);
			sb.append(tmp);
		}
		
		return sb.toString();
	}
}
