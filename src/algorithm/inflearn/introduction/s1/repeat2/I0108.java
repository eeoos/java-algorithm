package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0108 {
	public static void main(String[] args) throws IOException {
		I0108 T = new I0108();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution2(s));
		
	}
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(Character.isAlphabetic(c)) sb.append(c);
		}
		
		if(sb.toString().equalsIgnoreCase(sb.reverse().toString())) return "YES";
		return "NO";
	}
	
	public String solution2(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toUpperCase().toCharArray()) {
			if(Character.isAlphabetic(c)) sb.append(c);
		}
		String tmp = sb.toString();
		int lt = 0, rt = tmp.length()- 1;
		while(lt < rt) {
			if(tmp.charAt(lt) != tmp.charAt(rt)) return "NO";
			lt++;
			rt--;
		}
		return "YES";
	}
}
