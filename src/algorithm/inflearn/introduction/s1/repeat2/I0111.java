package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0111 {
	public static void main(String[] args) throws IOException {
		I0111 T = new I0111();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		System.out.println(T.solution(s));
	}
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		char tmp = s.charAt(0);
		
		for(char c : s.toCharArray()) {
			if(tmp == c) {
				cnt++;
			}else {
				sb.append(tmp);
				if(cnt >1) sb.append(cnt);
				cnt = 1;
				tmp = c;
			}
		}
		
		sb.append(tmp);
		if(cnt >1) sb.append(cnt);

		
		
		return sb.toString();
	}
}
