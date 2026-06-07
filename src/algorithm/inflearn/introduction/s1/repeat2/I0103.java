package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;

public class I0103 {
	public static void main(String[] args) throws IOException {
		I0103 T = new I0103();
		
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(T.solution(s));
	}
	
	public String solution(String s) {
		String[] arr = s.split(" ");
		
		String result = "";
		for(String a : arr) {
			if(a.length() > result.length()) {
				result = a;
			}
		}
		
		return result; 
	}
}
