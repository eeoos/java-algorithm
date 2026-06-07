package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;
public class I0107 {
	public static void main(String[] args) throws IOException {
		I0107 T = new I0107();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution2(s));
	}
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		if(s.equalsIgnoreCase(sb.reverse().toString())) return "YES";
		return "NO";
	}
	
	public String solution2(String s) {
		int lt = 0, rt = s.length()-1;
		char[] arr = s.toUpperCase().toCharArray();
		while(lt < rt) {
			if(arr[lt] != arr[rt]) return "NO";
			lt++;
			rt--;
		}
		return "YES";
	}
}
