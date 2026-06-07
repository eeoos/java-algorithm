package algorithm.inflearn.introduction.s1.repeat2;

import java.io.*;
import java.util.*;

public class I0110 {
	public static void main(String[] args) throws IOException {
		I0110 T = new I0110();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		System.out.println(T.solution2(a, b));
		
	}
	
	public String solution(String a, String b) {
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		char[] arr = a.toCharArray();
		char t = b.charAt(0);
		
		for(int i = 0; i<arr.length; i++) {
			 if(arr[i] == t) list.add(i);
		}
		
		for(int i =0; i<arr.length; i++) {
			if(i>0) sb.append(" ");
			int min = Integer.MAX_VALUE;
			for(int j = 0; j<list.size(); j++) {
				min = Math.min(Math.abs(i - list.get(j)), min);
			}
			sb.append(min);
	
		}
		
		return sb.toString();
	}
	
	public String solution2(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[a.length()];
		
		int p = 1000;
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == b.charAt(0)) p = 0;
			else p++;
			arr[i] = p;
		}
		
		p = 1000;
		for(int i = a.length()-1; i>=0; i--) {
			if(a.charAt(i) == b.charAt(0)) p = 0;
			else {
				p++;
				arr[i] = Math.min(p, arr[i]);
			}
		}
		
		for(int i = 0; i<a.length(); i++) {
			if(i>0) sb.append(" ");
			sb.append(arr[i]);
		}
		
		return sb.toString();
	}
}
