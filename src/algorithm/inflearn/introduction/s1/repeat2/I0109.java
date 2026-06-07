package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0109 {
	public static void main(String[] args) throws IOException {
		
		I0109 T = new I0109();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution(s));
	}
	
	public int solution(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c)) sb.append(c);
		}
		
		return Integer.parseInt(sb.toString());
	}
}
