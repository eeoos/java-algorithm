package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0112 {
	public static void main(String[] args) throws IOException {
		I0112 T = new I0112();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		System.out.println(T.solution(n, s));
	}
	
	public String solution(int n, String s) {
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			String tmp = s.substring(0, 7).replace("#", "1").replace("*", "0");
			char c = (char)Integer.parseInt(tmp, 2);
			sb.append(c);
			s = s.substring(7);
		}
		return sb.toString();
	}
}
